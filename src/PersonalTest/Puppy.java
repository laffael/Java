/**
 * Created by IntelliJ IDEA.
 * User: Raphael Wang
 * Date: 2017-03-02
 * Time: 16:56 CST
 */
public class Puppy {
    private int puppyAge;

    private Puppy(String name) {
        System.out.println("Passed name is :" + name);
            }

    private void setPuppyAge(int age) {
        puppyAge = age;
    }

    private int  getAge() {
        System.out.println("Puppy's age is :" + puppyAge);
    return puppyAge;
    }

    public static void main(String[] Args) {
        Puppy puppyNameTom=new Puppy("Tom");
        puppyNameTom.setPuppyAge( 2 );
        puppyNameTom.getAge();
        System.out.println("the Value is: " + puppyNameTom.puppyAge);
    }

}
