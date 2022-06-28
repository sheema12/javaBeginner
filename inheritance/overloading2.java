/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance2;

/**
 *
 * @author sheem
 */
public class overloading2 {
    //across same class
    public static void main(String[] args) {
        addition a1=new addition();
        a1.add(2,3);
        a1.add(2,3,4);
    }
}
class addition{
    public void add(int a,int b){
        System.out.println(a+b);
    }
    public void add(int a,int b ,int c){
        System.out.println(a+b+c);
    }
}