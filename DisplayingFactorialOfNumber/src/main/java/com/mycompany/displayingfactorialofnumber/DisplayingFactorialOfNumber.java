/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingfactorialofnumber;

/**
 *
 * @author moka
 */
// Write A Java Program To Get Number From The User , And Then Get The Factorial
// Of The Number =>
import java.util.Scanner;
public class DisplayingFactorialOfNumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Number Is = ");
        int number = input.nextInt();
        System.out.printf("The Number Is = %d%n", number);
        int FactorialOfNumber = 1;
        for(int i=1 ; i <= number ; i++){
            FactorialOfNumber *= i;
        }
        System.out.printf("The Factorial Of The Number Is = %d%n", FactorialOfNumber);
    }
}