package builder;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class BluePrint {
    abstract public void setCpu();
    abstract public void setRam();
    abstract public void setStorage();

    abstract public Computer getComputer();

}
