/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hello;
import java.util.Scanner;
/**
 *
 * @author sheem
 */
public class arrays8 {
    public static void main(String[] args){
    int a[]= {1,2,3,4,5};
    System.out.println(a[2]);
    Scanner input=new Scanner(System.in);
    int b[]=new int[5]; //declaring an array
    for(int i = 0;i<5;i++){
        b[i]=input.nextInt();      //reading from user 
    }
    for(int i = 0;i<5;i++){
        System.out.println(b[i]); 
    }
    
    for(int k:b)
    {
        System.out.println(k);   //enhanced for loop 
    }
    //searching element in array
    boolean found=false;
    int search=0;
        System.out.println("enter the element u want to search ");
        search=input.nextInt();
        for(int i=0;i<5;i++)
    {
        if(b[i]==search){
            System.out.println("element found in " + i +"th position" );
            found=true;
            break;
        }}
        if(!found){
            System.out.println("not found");
        }
        
    
        
}
}