package PatternBased.ClashOfClans.Implementation.Troop;

import PatternBased.ClashOfClans.Interfaces.IAttackType;
import PatternBased.ClashOfClans.Interfaces.ILevel;
import PatternBased.ClashOfClans.Interfaces.IMovement;

public abstract class Troops {

    protected IAttackType iAttackType;
    protected IMovement iMovement;
    protected ILevel iLevel;


    public int housingSpace(){
        return 5;
    }

    public abstract void Attack();
    public abstract double TrainingTime();
    public abstract double TrainingCost();
    public abstract double HitPoints();
    public abstract void Display();

}
