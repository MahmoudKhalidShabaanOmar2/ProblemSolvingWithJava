/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingformattedphonenumber;

/**
 *
 * @author moka
 */
// Write A Java Program To Get Array Ten Numbers From The User , From Zero To Nine 
// And Then Returning The String Of Those Number As A Contact Number By Using:
// StringBuilder() Method =>
import java.util.Scanner;
import java.util.Arrays;
public class DisplayingFormattedPhoneNumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Number Of Terms Is = ");
        int NumberOfTerms = input.nextInt();
        System.out.printf("The Number Of Terms Is = %d%n", NumberOfTerms);
        int[] ArrayOfPhoneNumbers = new int[NumberOfTerms];
        for(int i = 0 ; i < NumberOfTerms ; i++){
            System.out.print("Please Enter The Phone Number ("+i+") Is : ");
            ArrayOfPhoneNumbers[i] = input.nextInt();
        }
        System.out.printf("The Array Of The Phone Numbers Is : %s%n", Arrays.toString(ArrayOfPhoneNumbers));
        StringBuilder PhoneNumber = new StringBuilder();
        PhoneNumber.append("(");
        for(int j = 0 ; j < ArrayOfPhoneNumbers.length ; j++){
            PhoneNumber.append(ArrayOfPhoneNumbers[j]);
            if(j == 2){
                PhoneNumber.append(") ");
            }
            if(j == 5){
                PhoneNumber.append("-");
            }
        }
        System.out.printf("The Phone Number Is : %s%n", PhoneNumber.toString());
    }
}