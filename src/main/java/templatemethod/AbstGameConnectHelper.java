package templatemethod;

import lombok.extern.slf4j.Slf4j;
/*알고리즘의 구조를 메소드에 정의하고 하위 클래스에서 알고리즘 구조의 변경없이 알고리즘을 재정의하는 패턴*/
@Slf4j
public abstract class AbstGameConnectHelper {
    protected abstract String doSecurity(String string);
    protected abstract boolean authentication(String id, String password);
    protected abstract int authorization(String username);
    protected abstract String connection(String info);

    //템플릿 메소드
    public String requestConnection(String str) {
        //보안작업 -> 암호화 된 문자열을 복호화
        String decodedInfo = doSecurity(str);

        String id = "aaa";
        String password = "bbb";

        //반환된 것을 가지고 아이디, 암호를 할당한다
        if (!authentication(id, password)) {
            throw new Error("아이디 암호 불일치");
        }

        String userName= "";
        int authorization = authorization(userName);

        switch (authorization) {
            case -1:
                throw new Error("셧다운");
            case 0://게임 매니저
                log.info("게임 매니저");
                break;
            case 1://유료회원
                log.info("유료회원");
                break;
            case 2://무료회원
                log.info("무료회원");
                break;
            case 3://권한없음
                log.info("권한없음");
                break;
            default:
                log.info("default");
                break;
        }
        return connection(decodedInfo);
    }
}
