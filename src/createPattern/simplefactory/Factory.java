package createPattern.simplefactory;

public abstract class Factory {
    /**
     * 抽象工厂方法
     * 具体生产什么由之类决定
     *
     * @param cls 产品对象类型
     *  具体的产品对象
     */
    public abstract <T extends Product> T createProduct(Class<T> cls);
}


