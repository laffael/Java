package JavaLearnPackage1;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: Raphael Wang
 * Date: 2017-03-13
 * Time: 22:46 CST
 */
public class Test26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month");
        int month = scanner.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
            case 2:
                System.out.println("28 days");
            case 4:
            case 6:
            case 9:
                System.out.println("30 days");
            default:
                System.out.println("wrong month entered");

        }
    }
}
