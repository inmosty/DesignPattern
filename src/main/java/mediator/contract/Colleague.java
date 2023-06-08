package mediator.contract;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class Colleague {
    private Mediator mediator;

    public boolean join(Mediator mediator) {
        if(mediator==null){
            return false;
        }
        this.mediator = mediator;
        return mediator.addColleague(this);
    }

    public void sendData(String data) {
        if(mediator!=null){
            mediator.mediate(data);
        }
    }

    abstract public void handle(String data);
}
