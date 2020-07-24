package pokemon;

import attack.status.Confide;
import attack.special.NightDaze;
import attack.physical.Scratch;
import ru.ifmo.se.pokemon.*;

public class Zorua extends Pokemon {
    public Zorua(String name) {
        super(name, 100);
    }

    protected Zorua(String name, int lvl) {
        super(name, lvl);
        this.setStats(40, 65, 40, 80, 40, 65);
        this.addMove(new NightDaze());
        this.addMove(new Confide());
        this.addMove(new Scratch());
    }
}