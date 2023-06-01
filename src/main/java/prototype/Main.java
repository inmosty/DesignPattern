package prototype;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Circle circle1 = new Circle(1,1,3);
        Circle circle2 = circle1.copy();
        log.info(circle1.getX() + "," + circle1.getY() + "," + circle1.getR() +", " + circle1.getId());
        log.info(circle2.getX() + "," + circle2.getY() + "," + circle2.getR()+" , " + circle2.getId());
    }
}
