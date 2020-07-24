package attack.status;

import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove {
    public Confide() {
        super(Type.NORMAL, 0, 0);
    }

    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().stat(Stat.SPECIAL_ATTACK, (int) (pokemon.getStat(Stat.SPECIAL_ATTACK) - 1)));
    }

    protected String describe() {
        return "CONFIDE!..But..CHECK!";
    }
}