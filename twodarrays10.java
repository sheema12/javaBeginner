/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hello;
import java.util.*;
/**
 *
 * @author sheem
 */
public class twodarrays10 {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    //int a[][]=new int[2][2];
    //int[] a=new int[2][2];
    int a[][]={{1,1},{2,4}};
    System.out.println("no of rown"+a.length);
    System.out.println("no of elements in 0th row"+a[0].length);
    for(int i=0;i<a.length;i++){
        for(int j=0;j<a[i].length;j++){
            a[i][j]=input.nextInt();
        }
    }
    for(int k[]:a){
        for(int m:k){
            System.out.print(m);
        }
        System.out.println();
    }
    }
    
}
