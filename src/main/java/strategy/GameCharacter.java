package strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GameCharacter {
    //접근점
    public Weapon weapon;

    //교환 가능
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        if (weapon == null) {
            log.info("맨손 공격");
        }else {
            //위임
            weapon.attack();
        }
    }
}
