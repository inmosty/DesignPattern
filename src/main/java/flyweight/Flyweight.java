package flyweight;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Flyweight {
    private String data;

    public Flyweight(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}
