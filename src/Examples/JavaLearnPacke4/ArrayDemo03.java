package JavaLearnPacke4;

/**
 * Created by IntelliJ IDEA.
 * User: Raphael Wang
 * Date: 2017-03-19
 * Time: 21:23 CST
 */
public class ArrayDemo03 {
    public static void main(String[] args) {
        int score[] = {43, 34, 5, 66, 12};
        int max, min;
        max = min = score[0];
        for (int i = 0; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            }
            if (score[i] < min) {
                min = score[i];
            }
        }
        System.out.println(max+","+min);

    }

}
