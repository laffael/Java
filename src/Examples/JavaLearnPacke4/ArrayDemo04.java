package JavaLearnPacke4;

/**
 * Created by IntelliJ IDEA.
 * User: Raphael Wang
 * Date: 2017-03-19
 * Time: 21:33 CST
 */
public class ArrayDemo04 {
    public static void main(String[] args) {
        //冒泡排序
        int score[] = {12, 45, 23, 10, 300};
        for (int i = 0; i < score.length-1; i++) {
            for (int j = i+1; j < score.length; j++) {
                if (score[i] < score[j]) {
                    int temp = score[i];
                    score[i] = score[j];
                    score[j] = temp;
                }
            }
            System.out.print("第"+(i+1)+"次排序:  ");
            for (int j = 0; j < score.length; j++) {
                System.out.print(score[j]+"  ");
            }
            System.out.println( );

        }
        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i]);
        }

    }

}
