package top.kwseeker.pattern.template.clone;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import org.junit.Test;

import java.io.*;

/**
 * 和使用序列化工具原理其实是差不多的, 但是每个成员对象类都要实现Serializable
 */
public class SerializableDeepClone {

    @Test
    public void testSerializableDeepClone() {
        Address address = new Address();
        address.setAddress("南山区南头街道");
        Location location = new Location();
        location.setProvince("广东省");
        location.setCity("深圳");
        location.setAddress(address);
        Person someone = new Person();
        someone.setName("Arvin");
        someone.setAge(18);
        someone.setLocation(location);

        Person copiedSomeone = someone.deepClone();
        System.out.println(JSONObject.toJSONString(someone));
        System.out.println(JSONObject.toJSONString(copiedSomeone));

        Address newAddr = new Address();
        newAddr.setAddress("南山区西丽街道");
        location.setAddress(newAddr);
        System.out.println(JSONObject.toJSONString(someone));
        System.out.println(JSONObject.toJSONString(copiedSomeone));
    }

    @Data
    static class Person implements Serializable {

        private String name;
        private int age;
        //private Company company;
        private Location location;

        Person deepClone() {
            Person copied = null;
            try {
                // 写入字节输出流
                ByteArrayOutputStream baOs = new ByteArrayOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(baOs);
                oos.writeObject(this);
                //
                byte[] bytes = baOs.toByteArray();
                //
                ByteArrayInputStream baIs = new ByteArrayInputStream(bytes);
                ObjectInputStream ois = new ObjectInputStream(baIs);
                copied = (Person) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
            return copied;
        }
    }

    @Data
    static class Location implements Serializable {

        private String province;
        private String city;
        private Address address;
    }

    //@Data
    //class Company {
    //
    //    private String name;
    //    private String stockCode;
    //}

    @Data
    static class Address implements Serializable {

        private String address;
    }
}
