package builder;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        ComputerFactory factory = new ComputerFactory();
        factory.setBluePrint(new LgGramBlueprint());
        factory.make();

        Computer computer = factory.getComputer();
        log.info(computer.toString());
    }
}
