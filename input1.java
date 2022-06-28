
package hello;
import java.util.Scanner;
/**
 *
 * @author sheem
 */
public class input1 {
    
    public static void main(String[] args)
    {
        System.out.println("enter a name: ");
        Scanner input=new Scanner(System.in);
        String name=input.nextLine();
        System.out.println(name);
        System.out.println("enter a number ");
        int num=input.nextInt();
        System.out.println(num);
        System.out.println("enter a single char ");
        char one=input.next().charAt(0);
        System.out.println(one);
        System.out.print("Enter float: ");
        float myFloat = input.nextFloat();
        System.out.println(myFloat);
        System.out.print("Enter double: ");
        double myDouble = input.nextDouble();
        System.out.println(myDouble);
    }
    
}
