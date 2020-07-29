package attack.physical;

import ru.ifmo.se.pokemon.*;

public class LeafBlade extends PhysicalMove {
    public LeafBlade() {
        super(Type.GRASS, 90, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect eff = new Effect().stat(Stat.ATTACK, 125);
    }

    protected String describe() {
        return "LEAF BLYAD..BLADE!!!";
    }
}