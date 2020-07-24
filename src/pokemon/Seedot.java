package pokemon;

import attack.status.SwordDance;
import attack.special.ShadowBall;
import ru.ifmo.se.pokemon.*;

public class Seedot extends Pokemon {
    public Seedot(String name) {
        this(name, 33);
    }

    protected Seedot(String name, int lvl) {
        super(name, lvl);
        this.setStats(40, 40, 50, 30, 30, 30);
        this.addMove(new SwordDance());
        this.addMove(new ShadowBall());
    }
}