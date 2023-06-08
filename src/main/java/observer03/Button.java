package observer03;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Button {
    public Button(){
        observable = new Observable<String>();
    }
    private Observable<String> observable;
    public void addObserver(Observer<String> observer) {
        observable.addObserver(observer);
    }

    public void notifyObservers() {
        observable.notifyObservers(null);
    }

    public void onClick() {
        observable.setChanged();
        notifyObservers();
    }
}
