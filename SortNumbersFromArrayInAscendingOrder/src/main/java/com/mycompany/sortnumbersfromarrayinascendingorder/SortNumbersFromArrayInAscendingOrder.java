/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sortnumbersfromarrayinascendingorder;

/**
 *
 * @author moka
 */
// Write A Java Program To Get Array Of Different Numbers From The User , And 
// Then Displaying The Array Of Different Numbers In Ascending Order =>
import java.util.Scanner;
import java.util.Arrays;
public class SortNumbersFromArrayInAscendingOrder{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Number Of Terms Is = ");
        int NumberOfTerms = input.nextInt();
        System.out.printf("The Number Of Terms Is = %d%n", NumberOfTerms);
        int[] ArrayOfDifferentNumbers = new int[NumberOfTerms];
        for(int i = 0 ; i < NumberOfTerms ; i++){
            System.out.print("Please Enter The Number ("+i+") Is = ");
            ArrayOfDifferentNumbers[i] = input.nextInt();
        }
        System.out.printf("The Array Of Different Numbers Is : %s%n", Arrays.toString(ArrayOfDifferentNumbers));
        int[] result = ArrayOfDifferentNumbers.clone();
        Arrays.sort(result);
        System.out.printf("The Array Of Different Numbers In The Ascending Order Is : %s%n", Arrays.toString(result));
    }
}