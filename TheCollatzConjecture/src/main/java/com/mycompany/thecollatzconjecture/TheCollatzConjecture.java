/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.thecollatzconjecture;

/**
 *
 * @author moka
 */
// Write A Java Program To Get Number From The User , And Then Check If Is Even 
// Or Odd , Until Reaching To 1 , Then Counting Number Of Steps =>
// If The Number Is Even Then n = n /2
// If The Number Is Odd Then n = n * 3 + 1 =>
import java.util.Scanner;
public class TheCollatzConjecture{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Integer Number Is = ");
        int IntegerNumber = input.nextInt();
        System.out.printf("The Integer Number Is = %d%n", IntegerNumber);
        int NumberOfSteps = 0;
        while(IntegerNumber != 1){
            if(IntegerNumber %2 == 0){
                IntegerNumber /= 2;
            }
            else{
                IntegerNumber = IntegerNumber * 3 + 1;
            }
            NumberOfSteps++;
        }
        System.out.printf("The Number Of Steps Is = %d%n", NumberOfSteps);
    }
}