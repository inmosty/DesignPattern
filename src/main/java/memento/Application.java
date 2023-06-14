package memento;

import lombok.extern.slf4j.Slf4j;
import memento.abc.Memento;
import memento.abc.Originator;

import java.util.Stack;

@Slf4j
public class Application {
    public static void main(String[] args) {
        Stack<Memento> mementos = new Stack<>();

        Originator originator = new Originator();
        originator.setState("State 1");
        mementos.push(originator.createMemento());

        originator.setState("State 2");
        mementos.push(originator.createMemento());

        originator.setState("State 3");
        mementos.push(originator.createMemento());

        originator.setState("State Final");
        mementos.push(originator.createMemento());

        originator.restoreMemento(mementos.pop());
        log.info("State: {}", originator.getState());//state final

        originator.restoreMemento(mementos.pop());
        log.info("State: {}", originator.getState());//state 3

        originator.restoreMemento(mementos.pop());
        log.info("State: {}", originator.getState());//state 2

        originator.restoreMemento(mementos.pop());
        log.info("State: {}", originator.getState());//state 1

    }
}
