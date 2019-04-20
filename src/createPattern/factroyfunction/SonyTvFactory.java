package createPattern.factroyfunction;

public class SonyTvFactory extends TvFactory {
    @Override
    public Tv createTv() {
        return new SonyTv();
    }
}
