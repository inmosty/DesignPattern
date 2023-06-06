package bridge;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PrintMorseCode extends MorseCode{
    public PrintMorseCode(MorseCodeFunction function) {
        super(function);
    }

    public PrintMorseCode g() {
        dash();dash();dot();space();
        return this;
    }
    public PrintMorseCode a(){
        dot();dash();space();
//        System.call.Bip();
        return this;
    }
    public PrintMorseCode r() {
        dot();dash();dot();space();
//        System.call.longBip();
        return this;
    }
    public PrintMorseCode m() {
        dash();dash();space();
//        System.call.longTip();
        return this;
    }
}
