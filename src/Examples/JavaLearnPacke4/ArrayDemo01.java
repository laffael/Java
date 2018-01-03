package JavaLearnPacke4;

/**
 * Created by IntelliJ IDEA.
 * User: Raphael Wang
 * Date: 2017-03-19
 * Time: 19:16 CST
 */
public class ArrayDemo01 {
    public static void main(String[] args) {
        int[] score; //数组的声明
        score = new int[3];  //为数组开辟内存, 实例化
        for (int i = 0; i < score.length; i++) {
            score[i] = i * 2 + 1;
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(score[i]);
        }
        System.out.println(score.length);
    }

}
