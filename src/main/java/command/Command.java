package command;

import lombok.extern.slf4j.Slf4j;

public interface Command extends Comparable<Command> {
    void excute();
}
