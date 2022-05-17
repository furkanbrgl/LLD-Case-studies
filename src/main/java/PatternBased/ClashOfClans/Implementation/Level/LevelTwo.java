package PatternBased.ClashOfClans.Implementation.Level;

import PatternBased.ClashOfClans.Interfaces.ILevel;

public class LevelTwo implements ILevel {
    @Override
    public double increaseInTrainingTime() {
        return 3;
    }

    @Override
    public double increaseInTrainingCost() {
        return 3;
    }

    @Override
    public double increaseInAttackingRate() {
        return 3;
    }

    @Override
    public double increaseInHitPoints() {
        return 3;
    }
}
