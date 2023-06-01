package adapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Adapter adapter = new AdapterImpl();
        log.info(">>{}",adapter.twiceOf(100f));
        log.info(">>{}",adapter.twiceOf(88f));
    }
}
