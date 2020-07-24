package attack.status;

import ru.ifmo.se.pokemon.*;

public class HoneClaws extends StatusMove {
    public HoneClaws() {
        super(Type.DARK, 0, 0);
    }

    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().stat(Stat.ATTACK, (int) (pokemon.getStat(Stat.ATTACK) + 1)));
        pokemon.addEffect(new Effect().stat(Stat.ACCURACY, (int) (pokemon.getStat(Stat.ACCURACY) + 1)));
    }

    protected String describe() {
        return "I am going to hone these claws";
    }
}