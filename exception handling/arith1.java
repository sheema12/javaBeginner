/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;
import java.util.*;
/**
 *
 * @author sheem
 */
public class arith1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter 2 nos");
        
        try{
            int a=input.nextInt();
            int b=input.nextInt();
            if(b==0){
                throw new ArithmeticException("not allowed");
            }
            if(b==13){
                throw new sheemaexception("i dont like 13");
            }
            System.out.println(a/b);
        }
        catch(sheemaexception m){
            System.out.println(m.getMessage());
        }
        catch(ArithmeticException e){
            System.out.println("zero is not allowed ");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}

class sheemaexception extends Exception{
    public sheemaexception(String S){
        super(S);
    }
}