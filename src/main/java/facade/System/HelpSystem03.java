package facade.System;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class HelpSystem03 {
    public HelpSystem03() {
        log.info("HelpSystem03 = {}",getClass().getSimpleName());
    }

    public void process() {
        log.info("process03 = {}",getClass().getSimpleName());
    }
}
