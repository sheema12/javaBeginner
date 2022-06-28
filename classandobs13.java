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
public class classandobs13 {
    public static void main(String[] args) {
        /*student sheema=new student();
        sheema.addinfo();
        sheema.view();
        student s[]=new student[10];
        for(int i=0;i<10;i++){
            s[i]=new student();
        }
        for(int i=0;i<10;i++){
            s[i].addinfo();
        }
        for(int i=0;i<10;i++){
            s[i].view();*/
        
        teacher t=new teacher("sheema",12);
    }}
class student{
    String name;
    String reg;
    public void addinfo(){
        Scanner input=new Scanner(System.in);
        name=input.nextLine();
        reg=input.nextLine();
    }
    public void view(){
        System.out.println(name);
        System.out.println(reg);
    }
     
}
//parameterized constructor
class teacher{
    private String tname;
    private int tage;
    
    public teacher(String iname,int iage)
    {
        tname=iname;
        tage=iage;
        System.out.println(tname+tage);
    }
}
