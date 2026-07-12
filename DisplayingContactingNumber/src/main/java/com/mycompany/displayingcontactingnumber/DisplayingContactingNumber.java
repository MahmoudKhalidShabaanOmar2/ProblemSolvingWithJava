/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingcontactingnumber;

/**
 *
 * @author moka
 */
// Write A Java Program To Get Array Of Ten Numbers From Zero To Nine , And Then 
// Displaying The Phone Number By Using String.format() Method =>
import java.util.Scanner;
import java.util.Arrays;
public class DisplayingContactingNumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Number Of Terms Is = ");
        int NumberOfTerms = input.nextInt();
        System.out.printf("The Number Of Terms Is = %d%n", NumberOfTerms);
        int[] ArrayOfPhoneNumbers = new int[NumberOfTerms];
        for(int i = 0 ; i < NumberOfTerms ; i++){
            System.out.print("Please Enter The Phone Number ("+i+") Is = ");
            ArrayOfPhoneNumbers[i] = input.nextInt();
        }
        System.out.printf("The Array Of The Phone Numbers Is : %s%n", Arrays.toString(ArrayOfPhoneNumbers));
        String PhoneNumber = String.format("(%d%d%d) -%d%d%d-%d%d%d%d", ArrayOfPhoneNumbers[0] , ArrayOfPhoneNumbers[1] , ArrayOfPhoneNumbers[2] , ArrayOfPhoneNumbers[3] , ArrayOfPhoneNumbers[4] , ArrayOfPhoneNumbers[5] , ArrayOfPhoneNumbers[6] , ArrayOfPhoneNumbers[7] , ArrayOfPhoneNumbers[8] , ArrayOfPhoneNumbers[9]);
        System.out.printf("The Phone Number Is %s%n", PhoneNumber);
    }
}