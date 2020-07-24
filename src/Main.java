import pokemon.*;
import ru.ifmo.se.pokemon.Battle;

public class Main {

    public static void main(String[] args) {
        System.out.println("БОЙ!\n");
        Battle battle = new Battle();
        battle.addAlly(new Shiftry("Shiffie"));
        battle.addFoe(new Zorua("Zor"));
        battle.go();
    }
}