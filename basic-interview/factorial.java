/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nokia;

/**
 *
 * @author sheem
 */
public class factorial {
    public static long factorial(long n) {
	if (n == 1)
		return 1;
	else
		return (n * factorial(n - 1));
}
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
