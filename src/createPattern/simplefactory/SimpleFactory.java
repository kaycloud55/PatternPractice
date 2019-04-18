package createPattern.simplefactory;

/**
 * 简单工厂模式，对外部隐藏对象创建细节。
 * 对外提供创建对象的功能，但是外部不需要关心具体的实现。
 * 可以降低调用端和模块之间的耦合度。
 *
 * 最小知识原则
 */

public class SimpleFactory extends Factory{

    @Override
    public <T extends Product> T createProduct(Class<T> cls) {
        Product product = null;
        try {
            product = (Product) Class.forName(cls.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
