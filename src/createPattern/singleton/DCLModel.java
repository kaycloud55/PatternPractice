package createPattern.singleton;

/**
 * 双重检查锁：避免了懒汉模式下，每次调用getInstance()都要同步的问题，只在创建对象的时候才会去同步
 *
 * 为什么要第二次判空？
 * -- 因为在某个线程获取到锁以后，别的线程已经创建完了对象。比如线程A和线程B同时进入等待锁的过程，A优先获得资源，
 * 完成了对象的创建。然后B获得资源，进入同步代码块内部，这个时候对象已经创建出来了，如果不进行判空，就会重复构造对象。
 *
 * DCL由于JVM乱序执行的原因，还是存在问题
 * JVM创建对象分三步：
 * 1.开辟内存空间
 * 2.在堆内存中实例化，分配参数
 * 3.将引用指向对象
 *
 * 先执行3再执行2就会出问题
 *
 * 一种解决办法是给instance加volatile，表示不允许乱序执行
 */
public class DCLModel {
//    private static volatile DCLModel instance;
    private static DCLModel instance;

    private DCLModel() {
    }

    private static DCLModel getInstance(){
        if (instance == null) {
            synchronized (DCLModel.class) {
                if (instance == null) {
                    instance = new DCLModel();
                }
            }
        }
        return instance;
    }
}
