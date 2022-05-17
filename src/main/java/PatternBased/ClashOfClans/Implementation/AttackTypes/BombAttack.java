package PatternBased.ClashOfClans.Implementation;

import PatternBased.ClashOfClans.Interfaces.IAttackType;

public class BombAttack implements IAttackType {
    @Override
    public void attack() {
        System.out.println("Bomb Attack");
    }
}
