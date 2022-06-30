/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oops;
import java.util.*;
/**
 *
 * @author sheem
 */
public class nestedactivity2 {
    public static void main(String[] args) {
        faculty f1=new faculty("sheema","123");
        faculty.degree d1=f1.new degree("mtech",2024,"vit");
        d1.display();
                }
    
}
class faculty{
    private String name;
    private String empid;
    public faculty(String iname,String iemp){
        name=iname;
        empid=iemp;
    }
    public class degree{
        public String d_name;
        public int year;
        public String uni;
        
        public degree(String id_name,int iyear,String iuni){
        d_name=id_name;
        year=iyear;
        uni=iuni;
    }
        public void display(){
            System.out.println(name);
            System.out.println(d_name+year+uni);
        }
    }
}