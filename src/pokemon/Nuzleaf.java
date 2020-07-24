package pokemon;

import ru.ifmo.se.pokemon.*;

public class Nuzleaf extends Seedot {
    public Nuzleaf(String name) {
        this(name, 50);
    }

    protected Nuzleaf(String name, int lvl) {
        super(name, lvl);
        this.setStats(70, 70, 40, 60, 40, 60);
    }
}