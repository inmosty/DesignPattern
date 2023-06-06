package abstractfactory.gtbike;

import abstractfactory.abst.BikeFactory;
import abstractfactory.abst.Body;
import abstractfactory.abst.Wheel;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GtBikeFactory implements BikeFactory {
    @Override
    public Body createBody() {
        return new GtBody();
    }

    @Override
    public Wheel createWheel() {
        return new GtWheel();
    }
}
