package strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Ax implements Weapon {

    @Override
    public void attack() {
        log.info("도끼 공격");
    }
}
