/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingsumofallevennumbersfromarrayofnumbers;

/**
 *
 * @author moka
 */
// Write A Java Program To Get Array Of All Numbers , And Then Displaying 
// The Sum Of All Even Numbers From The Array =>
import java.util.Scanner;
import java.util.Arrays;
public class DisplayingSumOfAllEvenNumbersFromArrayOfNumbers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Number Of Terms Is = ");
        int NumberOfTerms = input.nextInt();
        System.out.printf("The Number Of Terms Is = %d%n", NumberOfTerms);
        int[] ArrayOfNumbers = new int[NumberOfTerms];
        for(int i = 0 ; i < NumberOfTerms ; i++){
            System.out.print("Please Enter The Number ("+i+") Is = ");
            ArrayOfNumbers[i] = input.nextInt();
        }
        System.out.printf("The Array Of All Numbers Is : ", Arrays.toString(ArrayOfNumbers));
        int SumOfAllEvenNumbersFromArray = 0;
        System.out.println("The Even Numbers Only From The Array Of Numbers Is : ");
        for(int j=0 ; j < NumberOfTerms ; j++){
            if(ArrayOfNumbers[j] %2 == 0){
                System.out.println(ArrayOfNumbers[j]);
                SumOfAllEvenNumbersFromArray += ArrayOfNumbers[j];
            }
        }
        System.out.printf("The Sum Of All Even Numbers From The Array Of Numbers Is = %d%n", SumOfAllEvenNumbersFromArray);
    }
}