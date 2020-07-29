import pokemon.*;
import ru.ifmo.se.pokemon.Battle;

public class Main {

    public static void main(String[] args) {
        System.out.println("Битва Нексус объявляется открытой! В конце вы получите тортик\n");
        Battle battle = new Battle();
        battle.addAlly(new Celebi("Celebi"));
        battle.addAlly(new Zorua("Zorua"));
        battle.addAlly(new Zoroark("Zoroark"));
        battle.addFoe(new Seedot("Seedot"));
        battle.addFoe(new Nuzleaf("Nuzleaf"));
        battle.addFoe(new Shiftry("Shiftry"));
        battle.go();
    }
}