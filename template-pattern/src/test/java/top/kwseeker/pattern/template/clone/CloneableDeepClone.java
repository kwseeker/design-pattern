package top.kwseeker.pattern.template.clone;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.atomic.LongAccumulator;

/**
 * 通过Clonable实现深克隆(所有子孙成员对象都要实现Cloneable)
 * 写法就是太麻烦了
 * 比如深克隆Person对象，让Person实现Cloneable接口
 */
public class CloneableDeepClone {

    @Test
    public void testCloneableDeepClone() throws CloneNotSupportedException {
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
            //如果成员对象很多，可以使用反射简写，判断成员是否是非简单类型且非String，并判断是否有实现Cloneable接口
            Person newObj = (Person) super.clone();
            if (company != null) {
                newObj.setCompany((Company) company.clone());
            }
            if (location != null) {
                newObj.setLocation((Location) location.clone());
            }
            return newObj;
        }
    }

    @Data
    class Location implements Cloneable {

        private String province;
        private String city;
        private Address address;

        @Override
        protected Object clone() throws CloneNotSupportedException {
            Location newObj = (Location) super.clone();
            if (address != null) {
                newObj.setAddress((Address) address.clone());
            }
            return newObj;
        }
    }

    @Data
    class Company implements Cloneable {

        private String name;
        private String stockCode;

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

    @Data
    class Address implements Cloneable {

        private String address;

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }
}
