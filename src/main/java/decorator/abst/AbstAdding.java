package decorator.abst;

import lombok.extern.slf4j.Slf4j;

/**
 * 컴포넌트와 장식을 동일시 해주는 역할을 합니다.
 */
@Slf4j
abstract public class AbstAdding implements IBeverage {
    private IBeverage base;

    public AbstAdding(IBeverage base) {
        super();
        this.base = base;
    }

    @Override
    public int getTotalPrice() {
        return base.getTotalPrice();
    }

    protected IBeverage getBase(){
        return base;
    }
}
