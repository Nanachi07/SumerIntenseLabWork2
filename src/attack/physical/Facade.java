package attack.physical;

import ru.ifmo.se.pokemon.*;

class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        Status stata = def.getCondition();
        if((stata == Status.BURN) || (stata == Status.POISON) || (stata == Status.PARALYZE)){
            def.setMod(Stat.HP, (int) Math.round(damage) * 2);
        }
    }
    protected String describe(){
        return "TRY THIS! FACADE ATTACK!";
    }
}