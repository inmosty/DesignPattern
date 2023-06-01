package factormethod;

import factormethod.concrete.HpCreator;
import factormethod.concrete.MpCreator;
import factormethod.framework.Item;
import factormethod.framework.ItemCreator;
import lombok.extern.slf4j.Slf4j;

/**
 * Factory Method 패턴과 Template Method 패턴은 둘 다 디자인 패턴이지만, 각각은 서로 다른 유형의 문제를 해결합니다.
 * Factory Method 패턴은 객체 생성 로직을 하위 클래스로 분리하여 코드 재사용을 늘리고 클래스 간의 결합도를 줄이는 데 초점을 맞춘 생성 패턴입니다. 이 패턴을 사용하면, 인스턴스화가 필요한 클래스를 직접 호출하지 않고, Factory Method를 통해 인스턴스를 생성하게 됩니다. 이를 통해 프로그램은 생성되는 객체의 구체적인 클래스를 몰라도 됩니다.
 * Template Method 패턴은 반면에 행동 패턴의 한 종류로서, 알고리즘의 구조를 정의하고 일부 단계를 하위 클래스에서 오버라이드할 수 있게 합니다. 이렇게 하면 알고리즘의 구조는 변경되지 않으면서 알고리즘의 일부 단계를 커스터마이즈할 수 있습니다. 이 패턴은 주로 알고리즘의 골격을 정의하고, 알고리즘의 일부 단계를 하위 클래스에서 구현하는 데 사용됩니다.
 * 따라서 주요 차이점은 Factory Method 패턴이 "객체 생성"에 초점을 맞추고 있는 반면, Template Method 패턴은 "알고리즘의 실행 순서"에 초점을 맞추고 있다는 것입니다.
 */
@Slf4j
public class Main {
    public static void main(String[] args) {
        ItemCreator creator;
        Item item;

        creator = new HpCreator();
        item = creator.create();
        item.use();

        creator = new MpCreator();
        item = creator.create();
        item.use();

    }
}
