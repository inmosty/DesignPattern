package abstractfactory02.proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RealSubject implements Subject {
    @Override
    public void action1() {
        log.info("간단한 업무");
    }

    @Override
    public void action2() {
        log.info("복잡한 업무 : realSubject");
    }
}
