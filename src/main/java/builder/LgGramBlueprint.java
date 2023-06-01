package builder;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LgGramBlueprint extends BluePrint {
    private final Computer computer;

    public LgGramBlueprint() {
        this.computer = new Computer("default", "default", "default");
    }

    @Override
    public void setCpu() {
        computer.setCpu("Intel");
    }

    @Override
    public void setRam() {
        computer.setRam("4GB");
    }

    @Override
    public void setStorage() {
        computer.setStorage("1TB");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
