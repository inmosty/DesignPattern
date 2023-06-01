package factormethod.framework;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class ItemCreator {

    public Item create(){
        requestItemsInfo();
        Item item = createItem();
        createItemLog();
        return item;
    }

    //아이템을 생성하기 전에 데이터베이스에서 아이템 정보를 요청합니다
    abstract protected void requestItemsInfo();

    //아이템을 생성 후 아이템 복제등의 불법을 방지하기 위해 데이터베이스에 아이템 생성 정보를 남깁니다.
    abstract protected void createItemLog();

    //아이템을 생성하는 알고리즘
    abstract protected Item createItem();


}
