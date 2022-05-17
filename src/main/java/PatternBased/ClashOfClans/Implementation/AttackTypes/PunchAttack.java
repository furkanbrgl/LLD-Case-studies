package PatternBased.ClashOfClans.Implementation.AttackTypes;

import PatternBased.ClashOfClans.Interfaces.IAttackType;

public class PunchAttack implements IAttackType {
    @Override
    public void attack() {
        System.out.println("Punch Attack");
    }
}
