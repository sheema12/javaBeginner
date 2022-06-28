
package hello;
import java.util.Scanner;
/**
 *
 * @author sheem
 */
public class patterns5 {
    public static void main(String[] args)
    {/*
        System.out.println("the number of lines user wants:");
        Scanner input=new Scanner(System.in);
        int num_lines=input.nextInt();
        for(int i=1;i<=num_lines;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();*/
        System.out.println("the number of lines user wants:");
        Scanner input=new Scanner(System.in);
        int num_lines=input.nextInt();
        for(int i=num_lines;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
