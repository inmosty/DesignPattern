package observer03;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Application {
    public static void main(String[] args) {
        //1. 제네릭
        //2. 델리게이트
        //3. 내부에 옵저버를 넣는다.

        Button button = new Button();
        button.addObserver(new Observer<String>() {
            @Override
            public void update(Observable<String> observable, String arg) {
                log.info("Button: {}", observable);
            }
        });
        button.onClick();
        button.onClick();
        button.onClick();
    }
}
