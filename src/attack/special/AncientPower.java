package attack.special;

import ru.ifmo.se.pokemon.*;

public class AncientPower extends SpecialMove {
    public AncientPower() {
        super(Type.ROCK, 60, 100);
    }

    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().chance(0.1).stat(Stat.ATTACK, (int) (pokemon.getStat(Stat.ATTACK) + 1)));
        pokemon.addEffect(new Effect().chance(0.1).stat(Stat.DEFENSE, (int) (pokemon.getStat(Stat.DEFENSE) + 1)));
        pokemon.addEffect(new Effect().chance(0.1).stat(Stat.HP, (int) (pokemon.getStat(Stat.HP) + 1)));
        pokemon.addEffect(new Effect().chance(0.1).stat(Stat.SPECIAL_ATTACK, (int) (pokemon.getStat(Stat.SPECIAL_ATTACK) + 1)));
        pokemon.addEffect(new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE, (int) (pokemon.getStat(Stat.SPECIAL_DEFENSE) + 1)));
        pokemon.addEffect(new Effect().chance(0.1).stat(Stat.SPEED, (int) (pokemon.getStat(Stat.SPEED) + 1)));
    }

    protected String describe() {
        return "IIII NEEEED AN ANCIENT POOOOWEEEEER";
    }
}