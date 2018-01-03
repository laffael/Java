package JavaLearnPackage1;

/**
 * Created by IntelliJ IDEA.
 * User: Raphael Wang
 * Date: 2017-03-09
 * Time: 17:00 CST
 */
public class Test16 {
    public static void main(String[] Args) {
        //大类型的数据位成为小类型的符号位
        int i = 129;
        byte b = (byte) i;
        System.out.println(i + ":" + b);
        System.out.println("-----------------------------------------");

        //大类型的数据位成为小类型的时候, 最高位丢失
        int i2 = 257;
        byte b2 = (byte) i;
        System.out.println(i2 + ":" + b2);

    }

}
