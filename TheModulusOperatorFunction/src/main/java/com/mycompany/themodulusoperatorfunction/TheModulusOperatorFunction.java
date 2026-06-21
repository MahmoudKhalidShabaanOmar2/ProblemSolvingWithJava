/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.themodulusoperatorfunction;

/**
 *
 * @author moka
 */
// Write A Java Program To Make A Modulus Operator Function To Display 
// The Modulus Of Any Number Without Using Modulus Arithmetic Operation =>
import java.util.Scanner;
public class TheModulusOperatorFunction{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Frist Number Is = ");
        int FristNumber = input.nextInt();
        System.out.printf("The Frist Number Is = %d%n", FristNumber);
        System.out.print("Please Enter The Second Number Is = ");
        int SecondNumber = input.nextInt();
        System.out.printf("The Second Number Is = %d%n", SecondNumber);
        int ModulusOperatorFunction = FristNumber - (FristNumber / SecondNumber) * SecondNumber;
        System.out.printf("The Modulus Arithmetic Operation Of The Frist Number By The Second Number Is = %d%n", ModulusOperatorFunction);
    }
}