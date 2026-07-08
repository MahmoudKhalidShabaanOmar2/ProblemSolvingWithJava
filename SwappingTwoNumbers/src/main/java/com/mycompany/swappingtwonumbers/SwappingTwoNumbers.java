/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.swappingtwonumbers;

/**
 *
 * @author moka
 */
// Write A Java Program To Get Two Numbers From The User , And Then Swapping 
// The Values Of The Two Numbers =>
import java.util.Scanner;
public class SwappingTwoNumbers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Frist Number Is = ");
        int FristNumber = input.nextInt();
        System.out.print("Please Enter The Second Number Is = ");
        int SecondNumber = input.nextInt();
        System.out.println("The Values Of The Two Numbers Before Swapping Is : ");
        System.out.printf("The Frist Number Is = %d%n", FristNumber);
        System.out.printf("The Second Number Is = %d%n", SecondNumber);
        int ThirdNumber = FristNumber;
        FristNumber = SecondNumber;
        SecondNumber = ThirdNumber;
        System.out.println("The Values Of The Two Numbers After Swapping Is : ");
        System.out.printf("The Frist Number Is = %d%n", FristNumber);
        System.out.printf("The Second Number Is = %d%n", SecondNumber);
    }
}