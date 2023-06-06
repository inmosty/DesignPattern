package abstractfactory.abst;

import lombok.extern.slf4j.Slf4j;

public interface BikeFactory {
    public Body createBody();
    public Wheel createWheel();
}
