/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.convertageintodays;

/**
 *
 * @author moka
 */
// Write A Java Program To Get The Age Into Days =>
import java.util.Scanner;
public class ConvertAgeIntoDays{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Age Into Years Is = ");
        float AgeIntoYears = input.nextFloat();
        System.out.printf("\nThe Age Into Years Is %f = ",AgeIntoYears);
        float AgeIntoDays = AgeIntoYears * 365.25f;
        System.out.printf("\nThe Age Into Days Is = %f", AgeIntoDays);
    }
}