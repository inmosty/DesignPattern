package abstractfactory02.mac;

import abstractfactory02.abst.Button;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MacButton implements Button {
    @Override
    public void click() {
        log.info("Mac clicked");
    }
}
