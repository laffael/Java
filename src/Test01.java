/**
 * Created by IntelliJ IDEA.
 * User: Raphael Wang
 * Date: 2017-02-26
 * Time: 18:53 CST
 * This is for calculation of
 *  ((sqrt(20)+sqrt(10))/(sqrt(20)-sqrt(10))
 */
public class Test01 {
    public static void main(String[] Args) {
        System.out.println("((sqrt(20)+sqrt(10))/(sqrt(20)-sqrt(10)) = "+
                Math.round(10*(Math.sqrt(20)+Math.sqrt(10))/(Math.sqrt(20)-Math.sqrt(10)))/10.0);
        double s20= Math.sqrt(20);
        double s10= Math.sqrt(10);
        double result=(s20+s10)/(s20-s10);
        result=Math.round(result*10)/10.0;
        System.out.println("((sqrt(20)+sqrt(10))/(sqrt(20)-sqrt(10)) = " + result);

    }

}
