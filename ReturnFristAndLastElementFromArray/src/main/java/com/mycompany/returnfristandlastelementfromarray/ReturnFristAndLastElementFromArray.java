/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.returnfristandlastelementfromarray;

/**
 *
 * @author moka
 */
// Write A Java Program To Get Array Of Different Elements , And Then Displaying
// The Frist Element , And Last Element From The Array Of Different Elements =>
import java.util.Scanner;
import java.util.Arrays;
public class ReturnFristAndLastElementFromArray{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Number Of Terms Is = ");
        int NumberOfTerms = input.nextInt();
        System.out.printf("The Number Of Terms Is = %d%n", NumberOfTerms);
        String[] ArrayOfDifferentElements = new String[NumberOfTerms];
        for(int i=0 ; i < NumberOfTerms ; i++){
            System.out.print("Please Enter The Element ("+i+") Is : ");
            ArrayOfDifferentElements[i] = input.next();
        }
        System.out.printf("The Array Of Different Elements Is : %s%n", Arrays.toString(ArrayOfDifferentElements));
        String[] ArrayOfFristAndLastElements = new String[] {ArrayOfDifferentElements[0] , ArrayOfDifferentElements[NumberOfTerms - 1]};
        System.out.printf("The Array Of The Frist , And Last Elements From The Array Of Different Elements Is : %s%n", Arrays.toString(ArrayOfFristAndLastElements));
    }
}