package createPattern.abstractfactory.hisense;

import createPattern.abstractfactory.base.AirCondition;
import createPattern.abstractfactory.base.Casher;
import createPattern.abstractfactory.base.MachineFactory;

public class HisenseFactory extends MachineFactory {
    @Override
    public AirCondition createAirCondition() {
        return new HisenseAirCondition();
    }

    @Override
    public Casher createCasher() {
        return new HisenseCasher();
    }
}
