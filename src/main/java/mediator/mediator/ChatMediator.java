package mediator.mediator;

import lombok.extern.slf4j.Slf4j;
import mediator.contract.Colleague;
import mediator.contract.Mediator;

@Slf4j
public class ChatMediator extends Mediator {
    @Override
    public void mediate(String data) {
        for (Colleague colleague : colleagues) {
            // 중재가능성
            colleague.handle(data);
        }

    }
}
