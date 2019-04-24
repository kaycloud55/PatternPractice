package createPattern.singleton;

public class HungarySingleton {
    private static final HungarySingleton instance = new HungarySingleton();

    private HungarySingleton(){}

    public HungarySingleton getInstance(){
        return instance;
    }
}
