package ClashOfClans;

import PatternBased.ClashOfClans.Actors.Barbarian;
import PatternBased.ClashOfClans.Actors.Dragon;
import org.junit.Test;

public class testClashOfClans {

    @Test
    public void clashOfClans() {

        Barbarian barbarian = new Barbarian();
        Dragon dragon = new Dragon();

        barbarian.Display();
        barbarian.Attack();

    }
}
