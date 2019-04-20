package createPattern.simplefactory;

public class SimpleFactoryDemo {


    public static void main(String[] args) {
        Car benzCar = SimpleFactory.produceCar("benz");
        benzCar.logo();
    }
}
