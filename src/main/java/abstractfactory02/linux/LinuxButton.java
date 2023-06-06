package abstractfactory02.linux;

import abstractfactory02.abst.Button;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LinuxButton implements Button {
    @Override
    public void click() {
        log.info("LinuxButton clicked");
    }
}
