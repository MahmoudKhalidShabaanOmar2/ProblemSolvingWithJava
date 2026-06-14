/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.multiplicationofalloddnumbersfromarrayofnumbers;

/**
 *
 * @author moka
 */
// Write A Java Program To Get Array Of All Numbers , Then Displaying 
// The Multiplication Of All Odd Numbers From Array Of Numbers =>
import java.util.Scanner;
import java.util.Arrays;
public class MultiplicationOfAllOddNumbersFromArrayOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Number Of Terms Is = ");
        int NumberOfTerms = input.nextInt();
        System.out.printf("The Number Of Terms Is = %d%n", NumberOfTerms);
        int[] ArrayOfNumbers = new int[NumberOfTerms];
        for(int i = 0 ; i < NumberOfTerms ; i++){
            System.out.print("Please Enter The Number ("+i+") Is = ");
            ArrayOfNumbers[i] = input.nextInt();
        }
        System.out.printf("The Array Of All Numbers Is : %s%n", Arrays.toString(ArrayOfNumbers));
        int MultiplicationOfAllOddNumbersFromArrayOfNumbers = 1;
        System.out.println("All Odd Numbers From The Array Of All Numbers Is : ");
        for(int j = 0 ; j < NumberOfTerms ; j++){
            if(ArrayOfNumbers[j] %2 != 0){
                System.out.println(ArrayOfNumbers[j]);
                MultiplicationOfAllOddNumbersFromArrayOfNumbers *= ArrayOfNumbers[j];
            }
        }
        System.out.printf("The Multiplication Of All Odd Numbers From The Array Of All Numbers Is = %d%n", MultiplicationOfAllOddNumbersFromArrayOfNumbers);
    }
}