/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hello;

/**
 *
 * @author sheem
 */
public class copyarray12 {
    public static void main(String[] args) {
        //cloning an array
        int a[]={1,2,3,4,5};
        int b[]=new int[a.length];
        b=a.clone();
        a[0]++;
        for(int k:b)
        {
            System.out.println(k);
        }
        for(int k:a){
            System.out.println(k);
        }
        int c[]={1,2,3,4,5};
        int d[]=new int[5];
        System.arraycopy(c, 2, d, 0, 3); //copying part of array
        for(int k:d){
            System.out.println(k);
        }
    }
}
