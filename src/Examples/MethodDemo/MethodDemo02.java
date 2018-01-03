package MethodDemo;

/**
 * Created by IntelliJ IDEA.
 * User: Raphael Wang
 * Date: 2017-03-21
 * Time: 22:05 CST
 */
public class MethodDemo02 {
    public static void main(String[] args) {
        tell(10, 20);
        tell(10, 20, 30);

    }

    public static void tell(int i, int j) {
        i = 10;
        j = 20;
        System.out.println(i + j);
    }

    public static void tell(int i, int j, int n) {

        i = 10;
        j = 20;
        n = 30;
        System.out.println(i + j + n);
    }

// 以下两种不叫重载， 没有参数的需求，以及书写格式不一样
//    public int tell() {
//
//    }
//
//    public String tell() {
//
//    }

}
