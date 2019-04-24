package createPattern.singleton;

/**
 * 静态内部类模式，只有在调用getInstance()的时候才会去加载，不占用资源
 * 静态类由虚拟机进行初始化，保证了同步问题
 *
 *
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton() {
    }

    public StaticInnerClassSingleton getInstance(){
        return Inner.instance;
    }

    private static class Inner{
        private static final StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }
}
