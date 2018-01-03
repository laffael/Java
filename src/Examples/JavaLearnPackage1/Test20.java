package JavaLearnPackage1;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: Raphael Wang
 * Date: 2017-03-11
 * Time: 16:54 CST
 */
public class Test20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入分数: ");
        int score= scanner.nextInt();
        boolean pass=score>=60;
        System.out.println(score + "及格: " + pass);

    }

}
