package builder02;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Computer computer = ComputerBuilder
                .startWithCpu("Intel i7")
                //.start()
                //.setCpu("Intel i7")
                .setRam("16GB")
                .build();
        log.info(computer.toString());
    }
}
