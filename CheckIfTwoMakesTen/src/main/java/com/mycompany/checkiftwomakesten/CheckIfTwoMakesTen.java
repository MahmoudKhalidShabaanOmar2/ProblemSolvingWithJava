/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.checkiftwomakesten;

/**
 *
 * @author moka
 */
// Write A Java Program To Get Two Numbers From The User , And Then Check If The
// Sum Of The Two Numbers Is Equal To Ten Or Not , Or If Only One Of The Two Number Is 10 =>
import java.util.Scanner;
public class CheckIfTwoMakesTen{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Frist Number Is = ");
        float FristNumber = input.nextFloat();
        System.out.printf("The Frist Number Is = %f%n", FristNumber);
        System.out.print("Please Enter The Second Number Is = ");
        float SecondNumber = input.nextFloat();
        System.out.printf("The Second Number Is = %f%n", SecondNumber);
        float SumOfNumbers = FristNumber + SecondNumber;
        System.out.printf("The Sum Of The Two Numbers Is = %f%n", SumOfNumbers);
        if((SumOfNumbers == 10) || (FristNumber == 10) || (SecondNumber == 10)){
            System.out.println("It Is TRUE...");
        }
        else{
            System.out.println("It Is FALSE...");
        }
    }
}