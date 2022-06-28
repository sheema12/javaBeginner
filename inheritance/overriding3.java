/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance2;

/**
 *
 * @author sheem
 */
public class overriding3 {
    //across diff classes
    public static void main(String[] args) {
        subclass s=new subclass();
        s.display();
    }
    
}

class superclass{
    public void display(){
        System.out.println("super");
    }
}

class subclass extends superclass{
    public void display(){
        super.display();
        System.out.println("sub");
    }
}