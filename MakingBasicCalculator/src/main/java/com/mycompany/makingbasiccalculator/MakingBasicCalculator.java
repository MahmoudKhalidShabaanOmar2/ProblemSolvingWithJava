/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.makingbasiccalculator;

/**
 *
 * @author moka
 */
// Write A Java Program To Get Two Numbers And Arithmetic Mathimeticas Operations
// To Make The Basic Calculator =>
import java.util.Scanner;
public class MakingBasicCalculator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Frist Number Is = ");
        float FristNumber = input.nextFloat();
        System.out.printf("The Frist Number Is = %f%n", FristNumber);
        System.out.print("Please Enter The Second Number Is = ");
        float SecondNumber = input.nextFloat();
        System.out.printf("The Second Number Is = %f%n", SecondNumber);
        System.out.print("Please Enter Any Arithmetic Mathimeticas Operation Is : ");
        char ArithmeticMathimeticasOperation = input.next().charAt(0);
        System.out.printf("The Arithmetic Mathimeticas Operation Is : %c%n", ArithmeticMathimeticasOperation);
        if(ArithmeticMathimeticasOperation == '+'){
            float SumOfNumbers = FristNumber + SecondNumber;
            System.out.printf("The Sum Of The Two Numbers Is : %f%n", SumOfNumbers);
        }
        else if(ArithmeticMathimeticasOperation == '-'){
            float SubtractOfNumbers = FristNumber - SecondNumber;
            System.out.printf("The Subtract Of The Two Numbers Is : %f%n", SubtractOfNumbers);
        }
        else if(ArithmeticMathimeticasOperation == '*'){
            float MultiplicateOfNumbers = FristNumber * SecondNumber;
            System.out.printf("The Multiplicate Of The Two Numbers Is : %f%n", MultiplicateOfNumbers);
        }
        else if(ArithmeticMathimeticasOperation == '/'){
            float DivisionOfNumbers = FristNumber / SecondNumber;
            System.out.printf("The Division Of The Two Numbers Is = %f%n", DivisionOfNumbers);
        }
        else if(ArithmeticMathimeticasOperation == '%'){
            float ModulusOfNumbers = FristNumber % SecondNumber;
            System.out.printf("The Modulus Of The Two Numbers Is = %f%n", ModulusOfNumbers);
        }
        else if(ArithmeticMathimeticasOperation == '^'){
            double PowerOfNumbers = Math.pow(FristNumber, SecondNumber);
            System.out.printf("The Power Of The Two Numbers Is = %f%n", PowerOfNumbers);
        }
        else{
            System.out.println("Please Enter A Valid Arithmetic Mathimeticas Operation...");
        }
    }
}