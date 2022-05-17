package PatternBased.ClashOfClans.Actors;

import PatternBased.ClashOfClans.Implementation.AttackTypes.FlameAttack;
import PatternBased.ClashOfClans.Implementation.Level.LevelOne;
import PatternBased.ClashOfClans.Implementation.Movement.AirMovement;
import PatternBased.ClashOfClans.Implementation.Troop.Troops;
import PatternBased.ClashOfClans.Interfaces.ILevel;

public class Dragon extends Troops {

    public Dragon() {
        iMovement = new AirMovement();
        iAttackType = new FlameAttack();
        iLevel = new LevelOne();
    }

    public Dragon(ILevel iLevel) {
        iMovement = new AirMovement();
        iAttackType = new FlameAttack();
        iLevel = iLevel;
    }

    @Override
    public void Attack() {
        iAttackType.attack();
        iMovement.Move();
        double damage = 2+3* iLevel.increaseInAttackingRate();
        System.out.println("Damage Given : " + damage);
    }

    @Override
    public double TrainingTime() {
        return 3+2*iLevel.increaseInTrainingCost();
    }

    @Override
    public double TrainingCost() {
        return 4*2*iLevel.increaseInTrainingCost();
    }

    @Override
    public double HitPoints() {
        return 2*3*iLevel.increaseInHitPoints();
    }

    @Override
    public void Display() {
        System.out.println("I am a Dragon");
    }
}
