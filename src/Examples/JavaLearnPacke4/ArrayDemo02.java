package JavaLearnPacke4;

/**
 * Created by IntelliJ IDEA.
 * User: Raphael Wang
 * Date: 2017-03-19
 * Time: 21:20 CST
 */
public class ArrayDemo02 {
    public static void main(String[] args) {
        // 静态初始化数组.
        int score[] = {2, 5, 6, 8, 5, 3}; //声明
        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i]);
        }
        System.out.println(score.length);
    }

}
