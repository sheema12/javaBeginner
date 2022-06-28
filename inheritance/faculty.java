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
public class faculty extends person{
    int empid;
    public faculty(String iuname,String ipass,int iid)
    {
        uname=iuname;
        pass=ipass;
        empid=iid;
    }
    
    public void getid(){
        Scanner input=new Scanner(System.in);
        System.out.println("enter id");
        empid=input.nextInt();
        System.out.println(empid);
    }
}
