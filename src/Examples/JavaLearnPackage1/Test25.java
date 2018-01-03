package JavaLearnPackage1;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: Raphael Wang
 * Date: 2017-03-13
 * Time: 22:41 CST
 */
public class Test25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入5分制分数");
        int score = scanner.nextInt();
        switch (score) {
            case 5:
                System.out.println("优秀");
                break;
            case 4:
                System.out.println("良好");
                break;
            case 3:
                System.out.println("及格");
                break;
            case 2:
            case 1:
            case 0:
                System.out.println("不及格");
                break;
            default:
                System.out.println("输入的数不是5分制分数");
                break;

        }
    }

}
