package createPattern.singleton;

/**
 * 懒汉模式
 * 在需要使用的时候才去初始化，这样可以节约资源
 * 问题在于：初始化的时候可能会遇到多线程环境，为了保证只有一个实例被创建，所以需要加锁
 *
 * 这样就导致每次调用都会进行同步，造成了不必要的开销
 */
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
    }

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;

    }
}
