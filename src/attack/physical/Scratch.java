package attack.physical;

import ru.ifmo.se.pokemon.*;

public class Scratch extends PhysicalMove {
    public Scratch() {
        super(Type.NORMAL, 40, 100);
    }

    protected String describe() {
        return "NOW I'LL SHOW YOU A SCRATCH!";
    }
}