/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.findingmaximumnumberfromarrayofdifferentnumbers;

/**
 *
 * @author moka
 */
// Write A Java Program To Get Array Of Different Numbers , And Then Finding 
// The Maximum Number From The Array Of Different Numbers =>
import java.util.Scanner;
import java.util.Arrays;
public class FindingMaximumNumberFromArrayOfDifferentNumbers{
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
        int MaximumNumberFromArrayOfDifferentNumbers = ArrayOfDifferentNumbers[0];
        for(int j=0 ; j < ArrayOfDifferentNumbers.length ; j++){
            System.out.println(ArrayOfDifferentNumbers[j]);
            if(ArrayOfDifferentNumbers[j] > MaximumNumberFromArrayOfDifferentNumbers){
                MaximumNumberFromArrayOfDifferentNumbers = ArrayOfDifferentNumbers[j];
            }
        }
        System.out.printf("The Maximum Number From The Array Of Different Numbers Is = %d%n", MaximumNumberFromArrayOfDifferentNumbers);
    }
}