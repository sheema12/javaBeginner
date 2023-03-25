/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nokia;
import java.util.*;
/**
 *
 * @author sheem
 */
public class arrayrot {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        
        int rotations = ob.nextInt();
        
        for(int j=1;j<rotations;j++)
        {int last=arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=last;
        }
        System.out.println(Arrays.toString(arr));
    }
}
