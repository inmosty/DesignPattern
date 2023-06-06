package bridge;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MorseCode {
    private final MorseCodeFunction function;

    public MorseCode(MorseCodeFunction function) {
        this.function = function;
    }

    public void dot(){
        function.dot();
    }

    public void dash() {
        function.dash();
    }

    public void space() {
        function.space();
    }


}
