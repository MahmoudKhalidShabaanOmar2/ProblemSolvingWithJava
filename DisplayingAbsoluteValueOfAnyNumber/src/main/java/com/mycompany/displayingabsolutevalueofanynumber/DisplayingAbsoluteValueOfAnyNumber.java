/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingabsolutevalueofanynumber;

/**
 *
 * @author moka
 */
// Write A Java Program To Display The Absolute Value Of Any Number =>
import java.util.Scanner;
public class DisplayingAbsoluteValueOfAnyNumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Any Negative Number Is = ");
        float NegativeNumber = input.nextFloat();
        System.out.printf("The Negative Number Is = %f%n",NegativeNumber);
        float AbsoluteOfNegativeNumber = Math.abs(NegativeNumber);
        System.out.printf("The Absolute Value Of The Negative Number Is = %f%n", AbsoluteOfNegativeNumber);
    }
}