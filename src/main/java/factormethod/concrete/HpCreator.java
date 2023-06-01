package factormethod.concrete;

import factormethod.framework.Item;
import factormethod.framework.ItemCreator;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

@Slf4j
public class HpCreator extends ItemCreator {
    @Override
    protected void requestItemsInfo() {
        log.info("HP 아이템을 요청합니다.");
    }

    @Override
    protected void createItemLog() {
        log.info("HP 아이템을 생성합니다.>>" + new Date());
    }

    @Override
    protected Item createItem() {
        return new HpPotion();
    }
}
