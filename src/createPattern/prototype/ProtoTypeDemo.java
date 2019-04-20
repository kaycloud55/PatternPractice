package createPattern.prototype;

import java.io.IOException;

public class ProtoTypeDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ProtoTypeImpl protoType = new ProtoTypeImpl();

        ProtoTypeImpl newProtoTypeObj = protoType.cloneImpl();
        ProtoTypeImpl newObj = protoType.deepClone();

        System.out.println(protoType.equals(newProtoTypeObj));
        System.out.println(protoType.getClass().equals(newProtoTypeObj.getClass()));
        System.out.println(protoType.equals(newObj));
        System.out.println(protoType.getClass().equals(newObj.getClass()));
    }
}
