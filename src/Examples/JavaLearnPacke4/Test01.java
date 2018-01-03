package JavaLearnPacke4;

/**
 * Created by IntelliJ IDEA.
 * User: Raphael Wang
 * Date: 2017-03-15
 * Time: 21:38 CST
 */
//用while循环结构打印大写字母
public class Test01 {
    public static void main(String[] args) {
        //解法1
        int i = 65;
        while (i <= 65 + 25) {
            System.out.println((char) i +" "+i);
            i++;
        }


    }

}
