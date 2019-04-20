package createPattern.simplefactory;

/**
 * 简单工厂模式，对外部隐藏对象创建细节。
 * 定义：定义一个工厂类，它可以根据参数的不同返回不同的实例，被创建的实例通常都具有相同的父类。
 * 因为在简单工厂模式中用于创建实例的方法是静态方法，因此简单工厂模式又被称为静态工厂方法，它属于创建型模式。
 * 对外提供创建对象的功能，但是外部不需要关心具体的实现。
 * 可以降低调用端和模块之间的耦合度。
 * <p>
 * 最小知识原则
 * <p>
 * 对扩展开放，对修改关闭
 * <p>
 * 只有一个具体的工厂类，没有抽象的工厂
 */

public class SimpleFactory {

//    /**
//     * @param cls 要创建的产品类型
//     * @param <T>
//     * @return 产品的实例
//     */
//    public <T extends Equipment> T createProduct(Class<T> cls) {
//        Equipment product = null;
//        try {
//            product = (Equipment) Class.forName(cls.getName()).newInstance();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return (T) product;
//    }

    //工厂方法的参数不一定是类名，也可以只是一个普通参数，只要能区分就可以了
    public static Car produceCar(String name) {
        Car car;
        switch (name) {
            case "四个圈":
                car = new AudiCar();
                break;
            case "三等分":
                car = new BenzCar();
                break;
            default:
                car = new Car() {
                    @Override
                    public void logo() {
                        System.out.println("no logo");
                    }
                };
                break;
        }
        return car;
    }

}
