package JavaLearnPacke4;

/**
 * Created by IntelliJ IDEA.
 * User: Raphael Wang
 * Date: 2017-03-16
 * Time: 0:07 CST
 */
//用while循环结构打印大写字母 解法2
public class Test02 {
    public static void main(String[] args) {
        char c = 'A';
        while (c <= 'Z') {
            System.out.println(c + " " + (int) c);
            c++;
        }

    }

}
