package facade;

import facade.System.Facade;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Application {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.process();
    }
}
