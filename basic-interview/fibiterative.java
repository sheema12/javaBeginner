/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nokia;

/**
 *
 * @author sheem
 */
public class fibiterative {
    public static void main(String[] args) {
        int count=10;
        int n1=0,n2=1,n3;
        System.out.println(n1+" "+n2);
        for(int i=2;i<count;i++){
        n3=n1+n2;
        System.out.println(n3);
        n1=n2;
        n2=n3;
        
        }
    }
}
