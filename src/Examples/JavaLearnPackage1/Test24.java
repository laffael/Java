package JavaLearnPackage1;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: Raphael Wang
 * Date: 2017-03-13
 * Time: 21:28 CST
 */
public class Test24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("输入java分数");
        //int java = scanner.nextInt();
        //System.out.println("输入android分数");
        //int android = scanner.nextInt();
        //System.out.println("输入sql分数");
        //int sql = scanner.nextInt();
        //if (java >= android && java >= sql) {
        //    System.out.println("最高分: " + java);
        //} else if (android >= sql) {
        //    System.out.println("最高分: " + android);
        //} else {
        //    System.out.println("最高分: " + sql);
        //}

        System.out.println(" Java Andorid Sql");
        int java = scanner.nextInt();
        int android = scanner.nextInt();
        int sql = scanner.nextInt();
        int maxScore = java;
        if (maxScore < android) {
            maxScore = android;
        }
        if (maxScore < sql) {
            maxScore = sql;
        }
        System.out.println("最高分"+maxScore);
    }

}
