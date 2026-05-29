/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.checkingifintegernumberdivisiblebyfive;

/**
 *
 * @author moka
 */
// Write A Java Program To Get Integer Number , And Then Check If The Number Is Divisible By Five =>
import java.util.Scanner;
public class CheckingIfIntegerNumberDivisibleByFive{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Integer Number Is = ");
        int number = input.nextInt();
        System.out.printf("The Integer Number Is = %d%n", number);
        if(number %5 == 0){
            System.out.print("It Is Divisible By Five.\n");
            System.out.printf("Because Your Entered Integer Number Is = %d%n",number);
            System.out.println("The Remainder (Modulus) Of The Number By Five Is = "+(number % 5));
        }
        else{
            System.out.print("It Is Not Divisible By Five.\n");
            System.out.printf("Because Your Entered Integer Number Is = %d%n",number);
            System.out.println("The Remainder (Modulus) Of The Number By Five Is = "+(number % 5));
        }
    }
}