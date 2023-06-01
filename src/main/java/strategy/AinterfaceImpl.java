package strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AinterfaceImpl implements Ainterface{
    @Override
    public void funcA() {
        log.info("funcA");
    }
}
