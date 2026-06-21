/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingfactorialofoddnumbersonly;

/**
 *
 * @author moka
 */
// Write A Java Program To Get An Integer Number From The User , And Then 
// Displaying The Factorial Of All Odd Numbers =>
import java.util.Scanner;
public class DisplayingFactorialOfOddNumbersOnly{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter An Integer Number Is = ");
        int IntegerNumber = input.nextInt();
        System.out.printf("The Integer Number Is = %d%n", IntegerNumber);
        int FactorialOfOddNumbersOnly = 1;
        for(int i=1 ; i <= IntegerNumber ; i++){
            if(i %2 != 0){
                FactorialOfOddNumbersOnly *= i;
            }
        }
        System.out.printf("The Factorial Of The Odd Numbers Is = %d%n", FactorialOfOddNumbersOnly);
    }
}