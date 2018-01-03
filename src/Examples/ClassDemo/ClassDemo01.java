package ClassDemo;

/**
 * Created by IntelliJ IDEA.
 * User: Raphael Wang
 * Date: 2017-03-21
 * Time: 22:17 CST
 */

class Person {
    String name;
    int age;
    public void tell() {
        System.out.println(age + name);
    }
}

public class ClassDemo01 {
    public static void main(String[] args) {
        //Person per = null; //声明，但是没有内存空间
        //per = new Person(); //实例化
       Person per = new Person(); //声明并实例化
        per.name = "张三";
        per.age = 10;
        per.tell();

    }

}
