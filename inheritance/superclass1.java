/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance2;
import java.util.*;
/**
 *
 * @author sheem
 */
public class superclass1 {
    public static void main(String[] args) {
        subclass s1=new subclass(10,30);
    }
}

class superclass{
    protected int a;
    public superclass(int input){
        a=input;
        System.out.println("superclass");
    }

}

class subclass extends superclass{
    private int b;
    public subclass(int input1, int inp){
        super(input1);
        b=inp;
        System.out.println("subclass");
    }
}