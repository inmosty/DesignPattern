package facade.System;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Facade {
    private final HelpSystem01 helpSystem01;
    private final HelpSystem02 helpSystem02;
    private final HelpSystem03 helpSystem03;

    public Facade() {
        this.helpSystem01 = new HelpSystem01();
        this.helpSystem02 = new HelpSystem02();
        this.helpSystem03 = new HelpSystem03();
    }

    public void process() {
        helpSystem01.process();
        helpSystem02.process();
        helpSystem03.process();
    }
}
