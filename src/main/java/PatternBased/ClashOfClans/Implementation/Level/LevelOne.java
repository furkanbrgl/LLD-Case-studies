package PatternBased.ClashOfClans.Implementation.Level;

import PatternBased.ClashOfClans.Interfaces.ILevel;

public class LevelOne implements ILevel {
    @Override
    public double increaseInTrainingTime() {
        return 2;
    }

    @Override
    public double increaseInTrainingCost() {
        return 2;
    }

    @Override
    public double increaseInAttackingRate() {
        return 2;
    }

    @Override
    public double increaseInHitPoints() {
        return 2;
    }
}
