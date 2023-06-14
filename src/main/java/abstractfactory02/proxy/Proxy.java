package abstractfactory02.proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Proxy implements Subject {
    private Subject real;

    public Proxy() {
        this.real = new RealSubject();
    }

    @Override
    public void action1() {
        log.info("간단한 업무");
    }

    @Override
    public void action2() {
        log.info("복잡한 업무");
        this.real.action2();
    }
}
