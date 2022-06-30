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
public class interface4 {
    public static void main(String[] args) {
        
    }
}
interface button{
    void setbuttoncolor();
    void setbuttontext();
    void onclick();
}
class reservation implements button{
    String color;
    String text;
    @Override
    public void setbuttoncolor(){
        color="blue";
    }
    @Override
    public void setbuttontext(){
        text="reserve";
    }
    @Override
    public void onclick(){
        System.out.println("done");
    }
}

class cancellation implements button{
    String color;
    String text;
    @Override
    public void setbuttoncolor(){
        color="red";
    }
    @Override
    public void setbuttontext(){
        text="cancel";
    }
    @Override
    public void onclick(){
        System.out.println("done");
    }
}