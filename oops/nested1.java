/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oops;
import java.util.*;
/**
 *
 * @author sheem
 */
public class nested1 {
    public static void main(String[] args) {
        //create obj for outer class
        outer obj1=new outer();
        outer.inner obj2=obj1.new inner();
        obj2.display();
        obj2.test();
    }
}
class outer{
    private String var1;
    protected String var2;
    public String var3;
    public static int count=1;
    
    public outer(){
        var1="test1";
        var2="test2";
        var3="test3";
    }
    
    class inner{
       public String nestedvar;
       public inner(){
           nestedvar="test4";
       }
        public void display(){
            System.out.println(var1+var2+var3+count);
        }
        public static void test(){
            System.out.println("can  i have static method");
        }
    }
    
}