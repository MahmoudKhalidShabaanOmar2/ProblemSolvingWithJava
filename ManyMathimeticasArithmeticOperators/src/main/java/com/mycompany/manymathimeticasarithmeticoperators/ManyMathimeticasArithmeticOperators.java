/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.manymathimeticasarithmeticoperators;

/**
 *
 * @author moka
 */
// Write A Java Program To Get Any Arithmetic Operation , Two Numbers From The 
// User , And Then Use Any Arithmetic Operation Between The Frist Number , And 
// The Second Number =>
import java.util.Scanner;
public class ManyMathimeticasArithmeticOperators{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Any Mathimeticas Arithmetic Operation Is : ");
        char AnyMathimeticasArithmeticOperation = input.next().charAt(0);
        System.out.printf("The Mathematicas Arithmetic Operation Is : %s%n", AnyMathimeticasArithmeticOperation);
        System.out.print("Please Enter The Frist Number Is = ");
        float FristNumber = input.nextFloat();
        System.out.printf("The Frist Number Is = %f%n", FristNumber);
        System.out.print("Please Enter The Second Number Is = ");
        float SecondNumber = input.nextFloat();
        System.out.printf("The Second Number Is = %f%n", SecondNumber);
        switch (AnyMathimeticasArithmeticOperation){
            case '+':
                float SumOfNumbers = FristNumber + SecondNumber;
                System.out.printf("The Sum Of The Two Numbers Is = %f%n", SumOfNumbers);
                break;
            case '-':
                float SubtractOfNumbers = FristNumber - SecondNumber;
                System.out.printf("The Subtract Of The Two Numbers Is = %f%n", SubtractOfNumbers);
                break;
            case '*':
                float MultiplicateOfNumbers = FristNumber * SecondNumber;
                System.out.printf("The Multiplicate Of The Two Numbers Is = %f%n", MultiplicateOfNumbers);
                break;
            case '/':
                float DivisionOfNumbers = FristNumber / SecondNumber;
                System.out.printf("The Division Of The Two Numbers Is : %f%n", DivisionOfNumbers);
                break;
            case '%':
                float ModulusOfNumbers = FristNumber % SecondNumber;
                System.out.printf("The Modulus Of The Two Numbers Is = %f%n", ModulusOfNumbers);
                break;
            case '^':
                double PowerOfNumbers = Math.pow(FristNumber, SecondNumber);
                System.out.printf("The Power Of The Two Numbers Is = %f%n", PowerOfNumbers);
                break;
            default:
                System.out.println("Please Enter Any Valid Mathimeticas Arithmetic Operation...");
                return;
        }
    }
}