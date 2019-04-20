package createPattern.abstractfactory.hair;

import createPattern.abstractfactory.base.AirCondition;
import createPattern.abstractfactory.base.Casher;
import createPattern.abstractfactory.base.MachineFactory;

public class HairFactory extends MachineFactory {
    @Override
    public AirCondition createAirCondition() {
        return new HairAirCondition();
    }

    @Override
    public Casher createCasher() {
        return new HairCasher();
    }
}
