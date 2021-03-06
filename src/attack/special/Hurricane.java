package attack.special;

import ru.ifmo.se.pokemon.*;

public class Hurricane extends PhysicalMove {
    public Hurricane() {
        super(Type.FLYING, 110, 70);
    }

    public static void confuse(Pokemon p) {
        Effect effect = new Effect().chance(0.3);
        if (effect.success())
            System.out.println(true);
        confuse(p);
    }

    protected String describe() {
        return "CONFUSE WITH HURRICANE!";
    }
}