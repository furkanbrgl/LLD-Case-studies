package PatternBased.ClashOfClans.Implementation.AttackTypes;

import PatternBased.ClashOfClans.Interfaces.IAttackType;

public class SwordAttack implements IAttackType {
    @Override
    public void attack() {
        System.out.println("Sword Attack");
    }
}
