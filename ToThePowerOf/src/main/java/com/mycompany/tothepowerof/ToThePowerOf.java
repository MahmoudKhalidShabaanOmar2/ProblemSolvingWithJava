/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tothepowerof;

/**
 *
 * @author moka
 */
// Write A Java Program To Get The Base Number , And Exponenet Number from 
// The User , And Then Displaying The Power Of Base Number By Exponent Number =>
import java.util.Scanner;
public class ToThePowerOf{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Base Number Is = ");
        int BaseNumber = input.nextInt();
        System.out.printf("The Base Number Is = %d%n", BaseNumber);
        System.out.print("Please Enter The Exponent Number Is = ");
        int ExponentNumber = input.nextInt();
        System.out.printf("The Exponent Number Is = %d%n", ExponentNumber);
        double PowerOfNumber = Math.pow(BaseNumber, ExponentNumber);
        System.out.printf("The Power Of The Number Is = %f%n", PowerOfNumber);
    }
}