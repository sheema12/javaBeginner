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
public class throws2 {
    public static void main(String[] args) {
        dividebyzero d=new dividebyzero();
        d.divnum();
        try{
            d.divnum();
        }
        catch(ArithmeticException e){
            System.out.println("erorr");
        }
        finally{
            System.out.println("were done");
        }
    }
}
class dividebyzero{
    private int a;
    private int b;
    public dividebyzero(){
        a=10;
        b=0;
    }
    public void divnum() throws ArithmeticException{ 
        System.out.println(a/b);
    }
}