/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayinglastelementsfromarray;

/**
 *
 * @author moka
 */
// Write A Java Program To Get Array Of Different Elements , And Then Return 
// The Last Element From The Array =>
import java.util.Scanner;
import java.util.Arrays;
public class DisplayingLastElementsFromArray{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Length Of The Array Is : ");
        int LengthOfArray = input.nextInt();
        System.out.printf("The Length Of The Array Is = %d%n", LengthOfArray);
        String[] ArrayOfDifferentElements = new String[LengthOfArray];
        for (int i = 0 ; i < LengthOfArray ; i++){
            System.out.print("Please Enter The Array Element ("+i+") Is : ");
            ArrayOfDifferentElements[i] = input.next();
        }
//        System.out.println(Arrays.toString(ArrayOfDifferentElements));
        System.out.printf("The Array Of Different Elements Is %s%n", Arrays.toString(ArrayOfDifferentElements));
        System.out.printf("The Last Element From The Array Of Different Elements Is %s%n", ArrayOfDifferentElements[LengthOfArray - 1]);
    }
}