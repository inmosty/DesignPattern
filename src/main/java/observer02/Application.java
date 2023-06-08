package observer02;

import lombok.extern.slf4j.Slf4j;

import java.util.Observable;
import java.util.Observer;

@Slf4j
public class Application {
    public static void main(String[] args) {
        Button button = new Button();
        button.addObserver(new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                log.info("click = {}",o);
            }
        });

        button.onClick();
        button.onClick();
        button.onClick();

    }
}
