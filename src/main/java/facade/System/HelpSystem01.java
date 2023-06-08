package facade.System;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class HelpSystem01 {
    public HelpSystem01() {
        log.info("HelpSystem01 = {}",getClass().getSimpleName());
    }

    public void process() {
        log.info("process = {}",getClass().getSimpleName());
    }
}
