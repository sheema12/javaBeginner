/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nokia;

// You are using Java
import java.util.*;
class hackathon{
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        int input1=ob.nextInt();
        int input2=ob.nextInt();
        int input3[] =new int[input1];
        for(int i=0;i<input1;i++){
            input3[i]=ob.nextInt();
        }
        int n=input1;
        int temp[]=new int[input1];
        Arrays.sort(input3);
        
                
        for(int i=0;i<input3.length/2;i++){
            temp[i]=input3[i];
            input3[i]=input3[n-i-1];
            input3[n-i-1]=temp[i];
        }
        System.out.println(input3);
        int sum=0;
        for(int i=0;i<input2;i++){
            sum+=input3[i];
        }
        System.out.println(sum);
                }
}