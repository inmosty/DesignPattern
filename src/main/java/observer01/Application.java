package observer01;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Application {
    public static void main(String[] args) {
        Button button = new Button();

        button.setOnclickListener(button1 -> log.info("Button Clicked = {}", button1));

        button.onClick();

    }
}