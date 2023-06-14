package flyweight;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Application {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight flyweight = factory.getFlyweight("A");
        log.info("{}", flyweight.getData());
        flyweight = factory.getFlyweight("A");
        log.info("{}", flyweight.getData());
        flyweight = factory.getFlyweight("A");
        log.info("{}", flyweight.getData());
    }
}
