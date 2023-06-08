package mediator.mediator;

import lombok.extern.slf4j.Slf4j;
import mediator.contract.Colleague;

@Slf4j
public class ChatColleague extends Colleague {
    @Override
    public void handle(String data) {
        log.info(this +" : "+ data);
    }
}
