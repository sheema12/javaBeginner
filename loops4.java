/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hello;

/**
 *
 * @author sheem
 */
public class loops4 {
    public static void main(String[] args){
        for(int i=0;i<5;i++){
            System.out.println("hello 5 times");
        }
        int n=0;
        while(n<5){
            System.out.println("helu 5 times");
            n++;
        }
        int x=0;
        do{
            System.out.println("vanakkam");
            x++;
            
        }while(x<5);
        int sum=0;
        System.out.println("first 10 natural nos");
        for(int y=0;y<=10;y++)
        {
            System.out.println(y);
            sum += y; 
        }
        System.out.println(sum);
        // create an array
    int[] numbers = {3, 9, 5, -5};
    
    // for each loop 
    for (int number: numbers) {
      System.out.println(number);
    }
    }
}
