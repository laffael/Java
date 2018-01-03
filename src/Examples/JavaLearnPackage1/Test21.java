package JavaLearnPackage1;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: Raphael Wang
 * Date: 2017-03-12
 * Time: 19:52 CST
 */
public class Test21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入5分制分数: ");
        int score = scanner.nextInt();
        boolean FiveScore = score >= 0 && score >= 5;
        System.out.println(score + " 是5分制分数" + FiveScore);

    }

}
