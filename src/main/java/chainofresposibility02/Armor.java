package chainofresposibility02;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Armor implements Defense {

    private Defense nextDefense;
    private float def;

    public Armor() {
    }

    public Armor(float def) {
        this.def = def;
    }

    public void setDef(float def) {
        this.def = def;
    }

    @Override
    public void defence(Attack attack) {
        //point!!
        process(attack);
        if (nextDefense != null) {
            nextDefense.defence(attack);
        }
    }

    private void process(Attack attack) {
        int amount = attack.getAmount();
        amount -= def;
        attack.setAmount(amount);
    }
    public void setNextDefense(Defense nextDefense) {
        this.nextDefense = nextDefense;
    }
}
