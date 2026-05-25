/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingthenextnumberfromtheintegerpassed;

/**
 *
 * @author moka
 */
// Write A Java Program To Display The Next Number From The Integer Passed =>
import java.util.Scanner;
public class DisplayingTheNextNumberFromTheIntegerPassed{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Integer Number Is = ");
        int number = input.nextInt();
        System.out.printf("The Integer Number Is = ", number);
//        int nextNumber = number + 1;
          int nextNumber = ++number;
        System.out.printf("The Next Integer Number Is = %d", nextNumber);
    }
}