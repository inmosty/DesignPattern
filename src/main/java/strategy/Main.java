package strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
/*        Ainterface ainterface = new AinterfaceImpl();
        ainterface.funcA();

        AObj aObj = new AObj();
        aObj.funcAA();*/

        GameCharacter gameCharacter = new GameCharacter();
        gameCharacter.attack();
        gameCharacter.setWeapon(new Knife());
        gameCharacter.attack();
        gameCharacter.setWeapon(new Sword());
        gameCharacter.attack();
        gameCharacter.setWeapon(new Ax());
        gameCharacter.attack();

    }
}
