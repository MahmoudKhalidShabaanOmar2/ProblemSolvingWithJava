/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingfactorialofevennumbersonly;

/**
 *
 * @author moka
 */
// Write A Java Program To Get An Integer Number , And Then Displaying 
// The Factorial Of Even Numbers Only =>
import java.util.Scanner;
public class DisplayingFactorialOfEvenNumbersOnly{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter An Integer Number Is = ");
        int IntegerNumber = input.nextInt();
        System.out.printf("The Integer Number Is = %d%n", IntegerNumber);
        int FactorialOfEvenNumbersOnly = 1;
        for (int i=1 ; i <= IntegerNumber ; i++){
            if(i %2 == 0){
                FactorialOfEvenNumbersOnly *= i;
            }
        }
        System.out.printf("The Facotrial Of The Even Numbers Only Is = %d%n", FactorialOfEvenNumbersOnly);
    }
}