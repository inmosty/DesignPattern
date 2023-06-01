package factormethod.concrete;

import factormethod.framework.Item;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HpPotion implements Item {
    @Override
    public void use() {
        log.info("체력 회복 아이템을 사용합니다.");
    }
}
