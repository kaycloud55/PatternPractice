package createPattern.factroyfunction;

public class SamsungTvFactory extends TvFactory {

    @Override
    public Tv createTv() {
        return new SamsungTv();
    }
}
