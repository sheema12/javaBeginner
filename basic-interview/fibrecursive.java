/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nokia;
import java.util.*;
/**
 *
 * @author sheem
 */
public class fibrecursive {
    static int n1=0,n2=1,n3=0;
    static void fib(int count){
        if(count>0){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.println(n3);
            fib(count-1);
        }
        
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int count=ob.nextInt();
        System.out.println(n1+" "+n2);
        fib(count-2);
        
    }
}
