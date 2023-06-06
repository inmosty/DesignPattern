package composite;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Component {

    public Component(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
