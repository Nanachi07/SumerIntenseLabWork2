package attack.special;

import ru.ifmo.se.pokemon.*;

public class ShadowBall extends SpecialMove {
    public ShadowBall() {
        super(Type.GHOST, 80, 100);
    }

    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().chance(0.2).stat(Stat.SPECIAL_DEFENSE, (int) (pokemon.getStat(Stat.SPECIAL_DEFENSE) - 1)));
    }

    protected String describe() {
        return "Try this Shadow Ball, sucker!";
    }
}