package builder02;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ComputerBuilder {
    private Computer computer;

    public ComputerBuilder() {
        computer = new Computer("default", "default", "default");

    }

    public static ComputerBuilder start() {
        return new ComputerBuilder();
    }

    public static ComputerBuilder startWithCpu(String cpu) {
        ComputerBuilder builder = new ComputerBuilder();
        builder.computer.setCpu(cpu);
        return builder;
    }

    public ComputerBuilder setCpu(String cpu) {
        computer.setCpu(cpu);
        return this;
    }

    public ComputerBuilder setRam(String ram) {
        computer.setRam(ram);
        return this;
    }

    public Computer build() {
        return computer;
    }
}
