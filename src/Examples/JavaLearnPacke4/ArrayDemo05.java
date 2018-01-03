package JavaLearnPacke4;

/**
 * Created by IntelliJ IDEA.
 * User: Raphael Wang
 * Date: 2017-03-19
 * Time: 22:08 CST
 */
public class ArrayDemo05 {
    public static void main(String[] args) {
        int score[][];
        score =new int[5][5];
        for (int i = 0; i <score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.print(score[i][j]+"  ");
            }
            System.out.println();
        }

    }

}
