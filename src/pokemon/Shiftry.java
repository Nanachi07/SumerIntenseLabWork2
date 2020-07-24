package pokemon;

import ru.ifmo.se.pokemon.*;
import attack.special.Hurricane;

public class Shiftry extends Nuzleaf {
    public Shiftry(String name) {
        this(name, 89);
    }

    protected Shiftry(String name, int lvl) {
        super(name, lvl);
        this.setStats(90, 100, 60, 90, 60, 80);
        this.addMove(new Hurricane());
    }
}