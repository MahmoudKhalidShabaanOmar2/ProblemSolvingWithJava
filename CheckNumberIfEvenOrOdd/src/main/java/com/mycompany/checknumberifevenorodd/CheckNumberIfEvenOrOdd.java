/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.checknumberifevenorodd;

/**
 *
 * @author moka
 */
// Write A Java Program To Get Number From The User , And 
// Then Check If Even Number , Or Odd Number =>
import java.util.Scanner;
public class CheckNumberIfEvenOrOdd{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Number Is = ");
        int Number = input.nextInt();
        System.out.printf("The Number Is = %d%n", Number);
        // Frist Method...
//        if(Number %2 == 0){
//            System.out.println("It Is Even Number... \n, Because Your Entered "
//            + "Number Is = "+Number+"\nAnd The Modulus Of The Number By Two Is = "
//            +Number % 2);
//        }
//        else{
//            System.out.println("It Is Odd Number... , \n, Because Your Entered "
//            + "Number Is = "+Number+"\n, And The Modulus Of The Number By Two Is = "
//            +Number % 2);
//        }
        // Second Method...
        if(Number %2 == 1){
            System.out.println("It Is Odd Number... \n, Because Your Entered "
            + "Number Is = "+Number+"\nAnd The Modulus Of The Number By Two Is = "
            + Number % 2);
        }
        else{
            System.out.println("It Is Even Number... \n, Because Your Entered "
            + "Number Is = "+Number+"\nAnd The Modulus Of The Number By Two Is = "
            + Number % 2);
        }
    }
}