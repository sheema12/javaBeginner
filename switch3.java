
package hello;
import java.util.Scanner;

/**
 *
 * @author sheem
 */
public class switch3 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        
        switch(number)
        {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
        /*
        String name=input.nextLine();
        switch(name)
        {
            case "wow":
                System.out.println("wow is written");
                break;
            case "no":
                System.out.println("no ntu irku");
                break;
            default:
                System.out.println("none");
                break;
        }*/
                
    }
}
