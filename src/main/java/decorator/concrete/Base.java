package decorator.concrete;

import decorator.abst.IBeverage;
import lombok.extern.slf4j.Slf4j;

/**
 * Component의 실질적인 인스턴스의 부분이며, 책임의 주체입니다.
 */
@Slf4j
public class Base implements IBeverage {
    @Override
    public int getTotalPrice() {
        return 0;
    }
}
