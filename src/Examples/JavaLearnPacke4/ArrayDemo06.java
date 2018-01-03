package JavaLearnPacke4;

/**
 * Created by IntelliJ IDEA.
 * User: Raphael Wang
 * Date: 2017-03-19
 * Time: 22:15 CST
 */
public class ArrayDemo06 {
    public static void main(String[] args) {
        int score[][] = {{100, 90, 50}, {67, 70, 100}, {50, 78, 80}};

        for (int i = 0; i <score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.print(score[i][j]+"  ");

            }
            System.out.println();
        }


    }

}
