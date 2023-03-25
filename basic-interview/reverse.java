/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nokia;

/**
 *
 * @author sheem
 */
public class reverse {
    public static void main(String[] args) {
        String a="sheema zainab";
        String b="";
        char c;
        for(int i=0;i<a.length();i++){
            c=a.charAt(i);
            b=c+b;
        }
        System.out.println(b);
    }
}
