/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingsumofallnumbersinarray;

/**
 *
 * @author moka
 */
// Write A Java Program To Get Array Of Different Numbers From The User , And 
// Then Displaying The Sum Of All Numbers Inside The Array Of Different Numbers =>
import java.util.Scanner;
import java.util.Arrays;
public class DisplayingSumOfAllNumbersInArray{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Number Of Terms Is = ");
        int NumberOfTerms = input.nextInt();
        System.out.printf("The Number Of Terms Is = %d%n", NumberOfTerms);
        int[] ArrayOfNumbers = new int[NumberOfTerms];
        for(int i = 0 ; i < NumberOfTerms ; i++){
            System.out.print("The Number ("+i+") Is = ");
            ArrayOfNumbers[i] = input.nextInt();
        }
        System.out.printf("The Array Of All Numbers Is : %s%n ", Arrays.toString(ArrayOfNumbers));
        int SumOfAllNumbersInArray = 0;
        for (int j=0 ; j < NumberOfTerms ; j++){
            SumOfAllNumbersInArray += ArrayOfNumbers[j];
        }
        System.out.printf("The Sum Of All Number In The Array Of Different Numbers Is = %d%n", SumOfAllNumbersInArray);
    }
}