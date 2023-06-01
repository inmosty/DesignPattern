package templatemethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DefaultGameConnectHelper extends AbstGameConnectHelper {

    @Override
    protected String doSecurity(String string) {
        log.info("강화된 알고리즘을 이용한 디코드");
        return string;
    }

    @Override
    protected boolean authentication(String id, String password) {
        log.info("authentication");
        return true;
    }

    @Override
    protected int authorization(String username) {
        log.info("authorization");
        //서버에서 유저이름 유저의 나이를 알 수 있다.
        //나이를 확인하고 시간을 확인하고 성인이아니고 10시 지났다면
        //권한이 없는 것으로 한다.

        return 1;
    }

    @Override
    protected String connection(String info) {
        log.info("connection!!~~~");
        return info;
    }
}
