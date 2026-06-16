/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.addedsubtractedmultiplicationdividedoftwonumbers;

/**
 *
 * @author moka
 */
// Write A Java Program To Get Two Numbers From The User , And Then Check If Added 
// , Subtracted , Multiplication , Or Division Is 24 , Display The Operation , Else 
// Display None =>
import java.util.Scanner;
public class AddedSubtractedMultiplicationDividedOfTwoNumbers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Frist Number Is = ");
        int FristNumber = input.nextInt();
        System.out.printf("The Frist Number Is = %d%n", FristNumber);
        System.out.print("Please Enter The Second Number Is = ");
        int SecondNumber = input.nextInt();
        System.out.printf("The Second Number Is = %d%n", SecondNumber);
        int SumOfNumbers = FristNumber + SecondNumber;
        System.out.printf("The Sum Of The Two Numbers Is = %d%n", SumOfNumbers);
        int SubtractOfNumbers = FristNumber - SecondNumber;
        System.out.printf("The Subtract Of The Two Numbers Is = %d%n", SubtractOfNumbers);
        int MultiplicationOfNumbers = FristNumber * SecondNumber;
        System.out.printf("The Multiplication Of The Two Numbers Is = %d%n", MultiplicationOfNumbers);
        int DivisionOfNumbers = FristNumber / SecondNumber;
        System.out.printf("The Division Of The Two Numbers Is = %d%n", DivisionOfNumbers);
        if(SumOfNumbers == 24){
           System.out.println("It Is Added...");
        }
        else if(SubtractOfNumbers == 24){
            System.out.println("It Is Subtracted...");
        }
        else if(MultiplicationOfNumbers == 24){
            System.out.println("It Is Multiplicated...");
        }
        else if(DivisionOfNumbers == 24){
            System.out.println("It Is Divided...");
        }
        else{
            System.out.println("It Is None...");
        }
        
    }
}