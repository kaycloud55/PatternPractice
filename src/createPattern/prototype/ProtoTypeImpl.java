package createPattern.prototype;

import java.io.*;

/**
 * 原型模式就是在 原型对象的基础上，对其进行克隆，产生一个相同类型的新对象。
 *  克隆有两种，浅克隆和深克隆。
 */
public class ProtoTypeImpl implements Cloneable, Serializable {

    private String name;
    private String age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAge(){
        return age;
    }

    //浅克隆，可以直接new对象，也可以通过Java语言提供的clone()方法来直接获得
    public ProtoTypeImpl cloneImpl() {
        Object obj = null;
        try {
            obj = super.clone();
        }catch (CloneNotSupportedException e){
            System.out.println("not support");
        }
        return (ProtoTypeImpl) obj;
    }

    /**
     * 深拷贝，对引用类型，会直接new新的对象，不只是复制引用地址。
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public ProtoTypeImpl deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream oim = new ObjectInputStream(bis);
        return (ProtoTypeImpl) oim.readObject();
    }
}
