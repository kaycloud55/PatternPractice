package createPattern.singleton;

/**
 * 枚举方式实现：简单，保证了反序列时不会出问题。默认枚举实例的创建是线程安全的。
 *
 * JVM对枚举类的处理就是编译成public final class T extend Enum的形式，而且枚举中的各个量是通过static来定义的，
 * 由JVM来保证他们同步的正确性。
 * 同时，规定了对于枚举类的反序列化安全性。
 * https://www.hollischuang.com/archives/2498
 */
public enum  EnumSingleton {
    INSTANCE;
}
