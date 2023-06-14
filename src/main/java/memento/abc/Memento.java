package memento.abc;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Memento {
    String state;

    protected Memento(String state) {
        this.state = state;
    }

    protected String getState() {
        return state;
    }
}
