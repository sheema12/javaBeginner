/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nokia;
import java.util.*;
/**
 *
 * @author sheem
 */
public class sortingarray {
    
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("please enter the number of elements in your array: ");
        int n=ob.nextInt();
        System.out.println("enter the array elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        System.out.println("the array from user:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
        int temp[]=new int[n];
        for(int i=0;i<n/2;i++){
            temp[i]=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp[i];
        }
        System.out.println("reverse : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
        
    }
}
