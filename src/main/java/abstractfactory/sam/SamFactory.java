package abstractfactory.sam;

import abstractfactory.abst.BikeFactory;
import abstractfactory.abst.Body;
import abstractfactory.abst.Wheel;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SamFactory implements BikeFactory {
    @Override
    public Body createBody() {
        return new SamBody();
    }

    @Override
    public Wheel createWheel() {
        return new SamWheel();
    }
}
