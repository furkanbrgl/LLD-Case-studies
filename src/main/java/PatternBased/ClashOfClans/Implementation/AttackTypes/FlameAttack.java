package PatternBased.ClashOfClans.Implementation;

import PatternBased.ClashOfClans.Interfaces.IAttackType;

public class FlameAttack implements IAttackType {
    @Override
    public void attack() {
        System.out.println("Flame Attack");
    }
}
