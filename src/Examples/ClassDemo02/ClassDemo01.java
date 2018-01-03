package ClassDemo02;


/**
 * Created by IntelliJ IDEA.
 * User: Raphael Wang
 * Date: 2017-03-22
 * Time: 22:18 CST
 */

class Person {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        if (a>=0&&a<=150) {
            age = a;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
     }

    public void tell() {
        System.out.println(getAge() + getName());

    }
}


public class ClassDemo01 {
    public static void main(String[] args) {
        Person per = new Person();
        //per.age = 30;
        //per.name = "John";
        per.setAge(30);
        per.setName("John");
        per.tell();

        Person per2 = new Person();
        per2.setAge(45);
        per2.setName("K");
        per2.tell();

    }


}

