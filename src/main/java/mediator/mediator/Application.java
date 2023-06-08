package mediator.mediator;

import lombok.extern.slf4j.Slf4j;
import mediator.contract.Colleague;
import mediator.contract.Mediator;

@Slf4j
public class Application {
    public static void main(String[] args) {
        Mediator mediator = new ChatMediator();
        Colleague colleague1 = new ChatColleague();
        Colleague colleague2 = new ChatColleague();
        Colleague colleague3= new ChatColleague();

        colleague1.join(mediator);
        colleague2.join(mediator);
        colleague3.join(mediator);

        colleague1.sendData("hello");
        colleague2.sendData("hello02");
        colleague3.sendData("hello03");


    }
}
