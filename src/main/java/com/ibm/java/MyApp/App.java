package com.ibm.java.MyApp;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner var1 = new Scanner(System.in);
        System.out.println("Enter number");
        int num1 = var1.nextInt();
        
        Scanner var2 = new Scanner(System.in);
        System.out.println("Enter number");
        int num2 = var2.nextInt();        
        
        
        int Sum = num1+num2;
        int Product = num1*num2;
        System.out.println("The sum of  two numbers is:"+ Sum);
        System.out.println("The product of  two numbers is:"+ Product);
    }
}
