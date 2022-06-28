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
public class continue7 {
    public static void main(String[] args){
        int sum=0;
        Scanner input=new Scanner(System.in);
        for(int i=0;i<5;i++){
            int number=input.nextInt();
            if(number%2==0){
                continue;
            }
            sum+=number;
        }
        System.out.println(sum);
    }
}
