package JavaLearnPackage1;

/**
 * Created by IntelliJ IDEA.
 * User: Raphael Wang
 * Date: 2017-03-06
 * Time: 16:38 CST
 */
public class Test14 {

    public static void main(String[] Args) {
        //int 类型转换为 float
        int i=0x10000001;
        float f=i;
        System.out.println(Integer.toBinaryString(i) + ":" + i);
        System.out.println(Integer.toBinaryString((int)f) + ":" + f);



    }

}
