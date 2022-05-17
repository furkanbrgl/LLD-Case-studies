package PatternBased.ClashOfClans.Actors;

import PatternBased.ClashOfClans.Implementation.AttackTypes.BombAttack;
import PatternBased.ClashOfClans.Implementation.Level.LevelOne;
import PatternBased.ClashOfClans.Implementation.Movement.GroundMovement;
import PatternBased.ClashOfClans.Implementation.Troop.Troops;
import PatternBased.ClashOfClans.Interfaces.ILevel;

public class Barbarian extends Troops {

    public Barbarian() {
        this.iMovement = new GroundMovement();
        this.iAttackType = new BombAttack();
        this.iLevel = new LevelOne();
    }

    //Level up
    public Barbarian(ILevel iLevel) {
        this.iMovement = new GroundMovement();
        this.iAttackType = new BombAttack();
        this.iLevel = iLevel;
    }

    @Override
    public void Attack() {
        iAttackType.attack();
        iMovement.Move();
        double attackRate = 100 + 100* iLevel.increaseInAttackingRate();
        System.out.println("Demage given : " + attackRate);
    }

    @Override
    public double TrainingTime() {
        return 2+2*iLevel.increaseInAttackingRate();
    }

    @Override
    public double TrainingCost() {
        return 2+2*iLevel.increaseInTrainingCost();
    }

    @Override
    public double HitPoints() {
        return 2+2*iLevel.increaseInHitPoints();
    }

    @Override
    public void Display() {
        System.out.println("I am a barbarian");
    }
}
