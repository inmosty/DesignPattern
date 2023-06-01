package singleton;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SystemSpeaker {
    private static SystemSpeaker instance;
    private int volume = 5;
    private SystemSpeaker(){
    }
    public static SystemSpeaker getInstance(){
        if(instance == null){
            instance = new SystemSpeaker();
        }
        return instance;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
