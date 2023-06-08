package chainofresposibility02;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Attack {
    private int amount;

    public Attack(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
