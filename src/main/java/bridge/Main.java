package bridge;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        PrintMorseCode printMorseCode = new PrintMorseCode(new SoundMCF());
        printMorseCode.g().a().r().m();
    }
}
