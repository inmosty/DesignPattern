package factormethod.concrete;

import factormethod.framework.Item;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MpPotion implements Item {

    @Override
    public void use() {
        log.info("MP 아이템을 사용합니다.");
    }
}
