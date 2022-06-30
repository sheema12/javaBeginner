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
public class abstractclass3 {
    public static void main(String[] args) {
        square s=new square();
        s.computearea();
        s.display();
    }
}
abstract class shape{
    double area;
    public void display(){
        System.out.println(area);
    }
    public abstract void computearea();
}

class square extends shape{
    int side;
    public square(){
        side=10;
    }
    @Override
    public void computearea(){
        area=side*side;
    }
}