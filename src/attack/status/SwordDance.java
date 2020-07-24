package attack.status;

import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.StatusMove;

public class SwordDance extends StatusMove {
    public SwordDance() {
        super(Type.NORMAL, 0, 0);
    }

    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().stat(Stat.ATTACK, (int) (pokemon.getStat(Stat.ATTACK) + 2)));
    }

    protected String describe() {
        return "SWORD DANCE, BITCH!";
    }
}