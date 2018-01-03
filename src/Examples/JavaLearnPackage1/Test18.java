package JavaLearnPackage1;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: Raphael Wang
 * Date: 2017-03-09
 * Time: 22:24 CST
 */
public class Test18 {
    public static void main(String[] Args) {
        //步骤1, 创建Scanner对象.
        Scanner scanner = new Scanner(System.in);
        //步骤2, 向控制台输出文本
        System.out.println("姓名: ");
        //步骤3, 接收输入的姓名字符串
        String name=scanner.next();
        System.out.println("性别");
        char sex = scanner.next().charAt(0);
        System.out.println("年龄");
        int age = scanner.nextInt();
        System.out.println("身高");
        double height=scanner.nextDouble();
        System.out.println("性格");
        String type = scanner.next();

        System.out.println(name+sex+age+height+type);

    }

}
