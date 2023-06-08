package facade.System;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class HelpSystem02 {
    public HelpSystem02() {
        log.info("HelpSystem02 = {}",getClass().getSimpleName());
    }

    public void process() {
        log.info("process02 = {}",getClass().getSimpleName());
    }
}
