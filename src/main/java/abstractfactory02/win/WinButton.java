package abstractfactory02.win;

import abstractfactory02.abst.Button;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WinButton implements Button {
    @Override
    public void click() {
        log.info("Win clicked");
    }
}
