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
public class arrrayops9 {
    public static void main(String[] args){
        //sorting using bubble sort
        System.out.println("enter the numbers");
        Scanner input= new Scanner(System.in);
        int a[]=new int[5],temp=0;
        for(int i=0;i<a.length;i++)
        {
            a[i]=input.nextInt();
        }
        /*  sorting using bubble sort
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    
                }
            }
        }*/
        
        /*to sort an array using inbuilt arrays method
        Arrays.sort(a);*/
        
        /*to sort unique elements in array
        int j=0;
        for(int i=0;i<a.length-1;i++){
            if(a[i]!=a[i+1])
            {
                j++;
                a[j]=a[i+1];
            }
        }
        for(int i=0;i<=j;i++){
            System.out.println(a[i]);
        }*/
        //reversing content of array
     
      for(int i=0;i<a.length/2;i++){
          temp=a[i];
          a[i]=a[a.length-1-i];
          a[a.length-1-i]=temp;
      }
      
        for(int k:a)
    {
        System.out.println(k);   //enhanced for loop 
    }
    }
}
