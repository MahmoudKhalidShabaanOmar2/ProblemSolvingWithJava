/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.checkifarraycontainsagivennumber;

/**
 *
 * @author moka
 */
// Write A Java Program To Get An Array Of Number From The User , And Then Check 
// If The Number Exists In The Array Of All Numbers =>
import java.util.Scanner;
import java.util.Arrays;
public class CheckIfArrayContainsAGivenNumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Number Of Terms Is = ");
        int NumberOfTerms = input.nextInt();
        System.out.printf("The Number Of Terms Is = %d%n", NumberOfTerms);
        int[] ArrayOfAllNumbers = new int[NumberOfTerms];
        for(int i=0 ; i < NumberOfTerms ; i++){
            System.out.print("Please Enter The Number ("+i+") Is = ");
            ArrayOfAllNumbers[i] = input.nextInt();
        }
        System.out.printf("The Array Of All Numbers Is : %s%n", Arrays.toString(ArrayOfAllNumbers));
        System.out.print("Please Enter The Given Number Is = ");
        int GivenNumber = input.nextInt();
        System.out.printf("The Given Number Is = %d%n", GivenNumber);
        for(int j=0 ; j < NumberOfTerms ; j++){
            if(ArrayOfAllNumbers[j] == GivenNumber){
                System.out.println("It Is Existing In The Array Of All Numbers...");
            }
        }
    }
}