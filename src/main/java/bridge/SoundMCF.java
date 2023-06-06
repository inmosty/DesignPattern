package bridge;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SoundMCF implements MorseCodeFunction {
    @Override
    public void dot() {
        log.info("삐");
    }

    @Override
    public void dash() {
        log.info("띠");
    }

    @Override
    public void space() {
        log.info("~");
    }
}
