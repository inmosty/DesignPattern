package templatemethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        AbstGameConnectHelper helper = new DefaultGameConnectHelper();
        helper.requestConnection("아이디 암호등 접속정보");

    }
}
