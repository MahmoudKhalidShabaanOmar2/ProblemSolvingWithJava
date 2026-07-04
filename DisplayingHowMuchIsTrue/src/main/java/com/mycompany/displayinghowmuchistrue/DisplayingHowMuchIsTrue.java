/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayinghowmuchistrue;

/**
 *
 * @author moka
 */
// Write A Java Program To Get Array Of Different Boolean Values , And Then 
// Counting The Total Numbers Of true Boolean Value That Existing Inside 
// The Array Of Different Boolean Values =>
import java.util.Scanner;
import java.util.Arrays;
public class DisplayingHowMuchIsTrue{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Number Of Terms Is = ");
        int NumberOfTerms = input.nextInt();
        System.out.printf("The Number Of Terms Is = %d%n", NumberOfTerms);
        boolean[] ArrayOfBooleanValues = new boolean[NumberOfTerms];
        for(int i=0 ; i < NumberOfTerms ; i++){
            System.out.print("Please Enter The Boolean Value ("+i+") Is : ");
            ArrayOfBooleanValues[i] = input.nextBoolean();
        }
        System.out.printf("The Array Of Different Boolean Values Is : %s%n", Arrays.toString(ArrayOfBooleanValues));
        int TotalNumbersOfTrueInsideArrayOfDifferentBooleanValues = 0;
        for(int j=0 ; j < NumberOfTerms ; j++){
            if(ArrayOfBooleanValues[j] == true){
                TotalNumbersOfTrueInsideArrayOfDifferentBooleanValues++;
            }
        }
        System.out.printf("The Total Numbers Of True Boolean Value Inside The Array Of Different Boolean Values Is = %d%n", TotalNumbersOfTrueInsideArrayOfDifferentBooleanValues);
    }
}