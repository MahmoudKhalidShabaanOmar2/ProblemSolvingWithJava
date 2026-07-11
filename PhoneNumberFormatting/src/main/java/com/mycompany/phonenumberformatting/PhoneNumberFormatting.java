/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.phonenumberformatting;

/**
 *
 * @author moka
 */
// Write A Java Program To Get Array Of Ten Numbers Between Zero To Nine , And 
// Then Returning String Of Those Number Formatted As A Contact Number By Using
// A Simple Solution By Adding Numbers Of Phone Numbers One By One =>
import java.util.Scanner;
import java.util.Arrays;
public class PhoneNumberFormatting{
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
        String PhoneNumber = "("+ArrayOfPhoneNumbers[0]+ArrayOfPhoneNumbers[1]+ArrayOfPhoneNumbers[2]+") "+ArrayOfPhoneNumbers[3]+ArrayOfPhoneNumbers[4]+ArrayOfPhoneNumbers[5]+"-"+ArrayOfPhoneNumbers[6]+ArrayOfPhoneNumbers[7]+ArrayOfPhoneNumbers[8]+ArrayOfPhoneNumbers[9];
        System.out.printf("The Phone Number Is : %s%n", PhoneNumber);
    }
}