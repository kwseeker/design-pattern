package top.kwseeker.pattern.template.clone;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import org.junit.Assert;
import org.junit.Test;

/**
 * 浅克隆
 * 比如浅克隆Person对象，让Person实现Cloneable接口
 */
public class ShallowClone {

    @Test
    public void testShallowClone() throws CloneNotSupportedException {
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

        Person copiedSomeone = (Person) someone.clone();
        System.out.println(JSONObject.toJSONString(someone));
        System.out.println(JSONObject.toJSONString(copiedSomeone));

        Address newAddr = new Address();
        newAddr.setAddress("南山区西丽街道");
        location.setAddress(newAddr);
        //拷贝获取的对象的对象成员和原对象的对象成员引用的是同一对象
        System.out.println(JSONObject.toJSONString(someone));
        System.out.println(JSONObject.toJSONString(copiedSomeone));
    }

    @Data
    class Person implements Cloneable {

        private String name;
        private int age;
        private Company company;
        private Location location;

        @Override
        public Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

    @Data
    class Location {

        private String province;
        private String city;
        private Address address;
    }

    @Data
    class Company {

        private String name;
        private String stockCode;
    }

    @Data
    class Address {

        private String address;
    }
}
