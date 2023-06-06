package decorator.concrete;

import decorator.abst.AbstAdding;
import decorator.abst.IBeverage;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Espresso extends AbstAdding {
    static protected int espressoCount = 0;
    public Espresso(IBeverage base) {
        super(base);
    }

    @Override
    public int getTotalPrice() {
        return super.getTotalPrice() + getAddPrice();
    }

    private static int getAddPrice() {
        espressoCount += 1;
        int addPrice = 100;
        if(espressoCount > 1){
            addPrice = 70;
        }
        return addPrice;
    }


}
