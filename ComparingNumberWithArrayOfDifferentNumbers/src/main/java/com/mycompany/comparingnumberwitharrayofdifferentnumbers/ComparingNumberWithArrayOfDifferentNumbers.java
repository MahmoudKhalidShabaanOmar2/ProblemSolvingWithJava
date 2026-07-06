/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.comparingnumberwitharrayofdifferentnumbers;

/**
 *
 * @author moka
 */
// Write A Java Program To Get Array Of Numbers , And Number From The User , And 
// Then Comparing The Given Number With Different Numbers In The Array Of 
// Different Numbers , And Then Returning TRUE If => 
// At Least Only One Number Is Grater Than Or Equal To Any Number Inside 
// Array Of Different Numbers =>
import java.util.Scanner;
import java.util.Arrays;
public class ComparingNumberWithArrayOfDifferentNumbers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Number Of Terms Is = ");
        int NumberOfTerms = input.nextInt();
        System.out.printf("The Number Of Terms Is = %d%n", NumberOfTerms);
        int[] ArrayOfDifferentNumbers = new int[NumberOfTerms];
        for(int i=0 ; i < NumberOfTerms ; i++){
            System.out.print("Please Enter The Number ("+i+") Is = ");
            ArrayOfDifferentNumbers[i] = input.nextInt();
        }
        System.out.printf("The Array Of Different Numbers Is : %s%n", Arrays.toString(ArrayOfDifferentNumbers));
        boolean found = false;
        System.out.print("Please Enter The Given Number Is = ");
        int GivenNumber = input.nextInt();
        System.out.printf("The Given Number Is = %d%n", GivenNumber);
        for(int j=0 ; j < ArrayOfDifferentNumbers.length ; j++){
            System.out.println(ArrayOfDifferentNumbers[j]);
            if(ArrayOfDifferentNumbers[j] >= GivenNumber){
                found = true;
            }
        }
        System.out.println(found);
    }
}