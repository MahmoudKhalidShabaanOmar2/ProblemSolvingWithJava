/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingthesquarerootoftwonumbers;

/**
 *
 * @author moka
 */
// Write A Java Program To Get Two Number From The User And Then 
// Displaying The Square Root Of The Two Numbers =>
import java.util.Scanner;
public class DisplayingTheSquareRootOfTwoNumbers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Frist Number Is = ");
        int FristNumber = input.nextInt();
        System.out.printf("The Frist Number Is = %d%n", FristNumber);
        System.out.print("Please Enter The Second Number Is = ");
        int SecondNumber = input.nextInt();
        System.out.printf("The Second Number Is = %d%n", SecondNumber);
        double SquareRootOfFristNumber = Math.sqrt(FristNumber);
        System.out.printf("The Square Root Of The Frist Number Is = %f%n", SquareRootOfFristNumber);
        double SquareRootOfSecondNumber = Math.sqrt(SecondNumber);
        System.out.printf("The Square Root Of The Second Number Is = %f%n", SquareRootOfSecondNumber);
    }
}