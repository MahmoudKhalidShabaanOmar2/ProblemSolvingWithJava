/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.equalityofthreevalues;

/**
 *
 * @author moka
 */
// Write A Java Program To Get Array Of Three Numbers , And Then Displaying 
// 3 If The Three Numbers Is Equal To Each Other.
// 2 If Only Two Numbers Is Equal To Each Other.
// 0 If No Equality.
import java.util.Scanner;
import java.util.Arrays;
public class EqualityOfThreeValues{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int NumberOfTerms = 3;
        int[] ArrayOfThreeNumbers = new int[NumberOfTerms];
        for(int i=0 ; i < NumberOfTerms ; i++){
            System.out.print("Please Enter The Number ("+i+") Is = ");
            ArrayOfThreeNumbers[i] = input.nextInt();
        }
        System.out.printf("The Array Of Three Numbers Is : %s%n", Arrays.toString(ArrayOfThreeNumbers));
        int CountOfEquality;
        for(int j=0 ; j < NumberOfTerms ; j++){
            System.out.println(ArrayOfThreeNumbers[j]);
        }
        if((ArrayOfThreeNumbers[0] == ArrayOfThreeNumbers[1]) && (ArrayOfThreeNumbers[1] == ArrayOfThreeNumbers[2])){
            CountOfEquality = 3;
            System.out.printf("The Number Of Equality Is = %d%n", CountOfEquality);
        }
        else if((ArrayOfThreeNumbers[0] == ArrayOfThreeNumbers[1]) || (ArrayOfThreeNumbers[1] == ArrayOfThreeNumbers[2]) || (ArrayOfThreeNumbers[0] == ArrayOfThreeNumbers[2])){
            CountOfEquality = 2;
            System.out.printf("The Number Of Equality Is = %d%n", CountOfEquality);
        }
        else{
            CountOfEquality = 0;
            System.out.printf("The Count Of Equality Is = %d%n", CountOfEquality);
        }
    }
}