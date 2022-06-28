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
public class string11 {
    public static void main(String[] args) {
        /* String name="sheema";
         String name1="sheema";
         if(name.equals(name1)){
             System.out.println("yes equal");
         }
         else{
             System.out.println("not equal");
         }
         System.out.println(name.substring(1,4)) ;
         String name2=name;
         System.out.println(name2);
         System.out.println(name2.replace('s','h'));
         System.out.println(name.toUpperCase());*/
         
         //program to accept uname and pass 1.check is username and pass is empty,pass shld me min 8,check if pass has username,check is pass matches confrm pass
         
         Scanner input=new Scanner(System.in);
         boolean valid=true;
         System.out.println("enter user name");
         String username=input.nextLine();
         System.out.println("enter pass");
         String pass=input.nextLine();
         System.out.println("confrm pass");
         String confpass=input.nextLine();
         if(username.isEmpty()||pass.isEmpty()||confpass.isEmpty())
         {
             System.out.println("enter properly ");
             valid=false;
         }
         if(valid){
             if(pass.length()<8){
                 System.out.println("length wrong");
             }
             if(pass.contains(username)){
             System.out.println("check");
         }
         if(!pass.equals(confpass)){
             System.out.println("no match");
         }
         
         }
         //program to get an array of names and display sorted,reverse every word in string and count the no of times evry word occurs in a given sentence
         String name[]=new String[5];
         String temp="";
         for(int i=0;i<5;i++){
             name[i]=input.nextLine();
         }
         for(String result:name)
         {
             System.out.println(result);
         }
         for(int i=0;i<name.length-1;i++){
             for(int j=0;j<name.length-1-i;j++){
                 if(name[j].compareTo(name[j+1])>0){
                     temp=name[j];
                     name[j]=name[j+1];
                     name[j+1]=temp;
                 }
             }
         }
         for(String result:name)
         {
             System.out.println(result);
         }
    }
}
