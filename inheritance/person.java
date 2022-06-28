/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance2;
import java.util.*;
/**
 *
 * @author sheem
 */
public class person {
    String uname;
    String pass;
    
    public void login(){
        String inputuser,inputpass;
        System.out.println("enter username");
        Scanner input=new Scanner(System.in);
        inputuser=input.nextLine();
        System.out.println("enter pass");
        inputpass=input.nextLine();
        if((inputuser.equals(uname))&&(inputpass.equals(pass))){
            System.out.println("allow");
            
        }else{
            System.out.println("domt allow");
        }
    }
}
