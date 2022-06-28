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
public class Students extends person{
    int age;
    
    
    public Students(String iuname,String ipass,int iage)
    {
        uname=iuname;
        pass=ipass;
        age=iage;
    }
    
    public void getinfo(){
        System.out.println(uname +age);
    }
    
    
}
