/**
 * Created by IntelliJ IDEA.
 * User: Raphael Wang
 * Date: 2017-03-02
 * Time: 16:56 CST
 */
public class Puppy {
    int puppyAge;

    public Puppy(String name) {
        System.out.println("Passed name is :" + name);
            }

    public void setPuppyAge(int age) {
        puppyAge = age;
    }

    public int  getAge(){
        System.out.println("Puppy's age is :" + puppyAge);
    return puppyAge;
    }

    public static void main(String[] Args) {
        Puppy thisPuppy=new Puppy("tom");
        thisPuppy.setPuppyAge( 2 );
        thisPuppy.getAge();
        System.out.println("the Value is: " + thisPuppy.puppyAge);
    }

}
