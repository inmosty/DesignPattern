package bridge;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DefaultMCF implements MorseCodeFunction {
    @Override
    public void dot() {
        log.info(".");
    }

    @Override
    public void dash() {
        log.info("-");
    }

    @Override
    public void space() {
        log.info(" ");
    }
}
