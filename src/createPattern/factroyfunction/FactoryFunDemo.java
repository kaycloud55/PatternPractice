package createPattern.factroyfunction;

public class FactoryFunDemo {

    public static void main(String[] args) {
        SamsungTvFactory samsungTvFactory = new SamsungTvFactory();
        Tv samsungTv = samsungTvFactory.createTv();


        SonyTvFactory sonyTvFactory = new SonyTvFactory();
        Tv sonyTv = sonyTvFactory.createTv();

        samsungTv.logo();
        sonyTv.logo();
    }
}
