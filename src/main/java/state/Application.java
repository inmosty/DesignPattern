package state;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Application {
    public static void main(String[] args) {
        Light light = new Light();

        light.off();
        light.off();
        light.off();

        light.on();
        light.on();
        light.on();

        light.off();
        light.on();
        light.off();
        light.on();
        light.off();
        light.on();

    }
}
