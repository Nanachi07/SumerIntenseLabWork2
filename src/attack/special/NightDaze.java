package attack.special;

import ru.ifmo.se.pokemon.*;

public class NightDaze extends SpecialMove {
    public NightDaze() {
        super(Type.DARK, 85, 95);
    }

    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().chance(0.4).stat(Stat.ACCURACY, (int) (pokemon.getStat(Stat.ACCURACY) - 1)));
    }

    protected String describe() {
        return "HA! NOW YOU'RE NOT ACCURATE!";
    }
}