package JavaLearnPackage1;

/**
 * Created by IntelliJ IDEA.
 * User: Raphael Wang
 * Date: 2017-03-09
 * Time: 16:53 CST
 */
public class Test15 {
    public static void main(String[] Args) {
        //long 类型转换为 float
        long l = 0x20000000000001L;
        double d = l;
        System.out.println(Long.toBinaryString(l) + ":" + l);
        System.out.println(Long.toBinaryString((long) d)+ ":" + d);


    }

}
