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
public class twodarrays9 {
    public static void main(String[] args){
        //rows in an multi d array can have different no of elements
        int a[][]={{1,2,3,4},{1,2,3},{1,2 },{1}};
        int i=0,j=0,sum=0;
        for(i=0;i<a.length;i++){
            for(j=0;j<a[i].length;j++){
                sum+=a[i][j];
            }
        }
        System.out.println(sum);
    }
}
