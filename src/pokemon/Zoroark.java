package pokemon;

import attack.status.HoneClaws;
import ru.ifmo.se.pokemon.*;

public class Zoroark extends Zorua {
    public Zoroark(String name) {
        this(name, 100);
    }

    protected Zoroark(String name, int lvl) {
        super(name, lvl);
        this.setStats(60, 105, 60, 120, 60, 105);
        this.addMove(new HoneClaws());
    }
}