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
public class break6 {
    public static void main(String[] args){
        int n=5;
        boolean lucky=false;
        Scanner input=new Scanner(System.in);
        System.out.println("enter 5 nos");
        for(int i=0;i<n;i++){
        int num=input.nextInt();
        if(num==23){
            System.out.println("lucky");
            lucky=true;
            break;
        }
        }
        if(!lucky){
            System.out.println("not lucky");
        }
    }
}
