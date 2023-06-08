package mediator.contract;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public abstract class Mediator {
    protected List<Colleague> colleagues;

    public Mediator() {
        this.colleagues = new ArrayList<>();
    }

    public boolean addColleague(Colleague colleague) {
        if (colleague != null) {
            return colleagues.add(colleague);
        }else{
            return false;
        }
    }

    public abstract void mediate(String data);
}
