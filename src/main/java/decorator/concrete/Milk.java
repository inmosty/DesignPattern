package decorator.concrete;

import decorator.abst.AbstAdding;
import decorator.abst.IBeverage;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Milk extends AbstAdding {
    public Milk(IBeverage base) {
        super(base);
    }

    @Override
    public int getTotalPrice() {
        return super.getTotalPrice() + 50;
    }
}
