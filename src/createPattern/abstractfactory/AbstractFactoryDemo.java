package createPattern.abstractfactory;

import createPattern.abstractfactory.base.AirCondition;
import createPattern.abstractfactory.base.Casher;
import createPattern.abstractfactory.hair.HairFactory;
import createPattern.abstractfactory.hisense.HisenseFactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        HairFactory hairFactory = new HairFactory();
        AirCondition hariAirCondition = hairFactory.createAirCondition();
        hariAirCondition.func();


        HisenseFactory hisenseFactory = new HisenseFactory();
        Casher hisenseCasher = hisenseFactory.createCasher();
        hisenseCasher.cash();
    }
}
