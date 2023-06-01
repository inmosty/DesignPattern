package singleton;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        SystemSpeaker speaker1 = SystemSpeaker.getInstance();
        SystemSpeaker speaker2 = SystemSpeaker.getInstance();

        log.info("speaker1: {}", speaker1.getVolume());
        log.info("speaker2: {}", speaker2.getVolume());

        speaker1.setVolume(10);
        log.info("speaker1: {}", speaker1.getVolume());
        log.info("speaker2: {}", speaker2.getVolume());

    }
}
