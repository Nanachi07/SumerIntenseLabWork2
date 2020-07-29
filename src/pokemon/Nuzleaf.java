package pokemon;

import attack.physical.LeafBlade;
import ru.ifmo.se.pokemon.*;

public class Nuzleaf extends Seedot {
    public Nuzleaf(String name) {
        this(name, 57);
    }

    protected Nuzleaf(String name, int lvl) {
        super(name, lvl);
        this.setStats(70, 70, 40, 60, 40, 60);
        this.addMove(new LeafBlade());
    }
}