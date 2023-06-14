package abstractfactory02.proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Application {
    public static void main(String[] args) {
        Subject realSubject = new RealSubject();
        realSubject.action1();
        realSubject.action2();
    }
}
