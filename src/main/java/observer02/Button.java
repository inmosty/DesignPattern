package observer02;

import lombok.extern.slf4j.Slf4j;

import java.util.Observable;

@Slf4j
public class Button extends Observable {
    public void onClick() {
        setChanged();
        notifyObservers();
    }
}
