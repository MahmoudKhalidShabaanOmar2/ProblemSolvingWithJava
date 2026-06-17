/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.invertrgbcolors;

/**
 *
 * @author moka
 */
// Write A Java Program To Get Array Of RGB Colors , And Then Inverted This Color =>
import java.util.Scanner;
import java.util.Arrays;
public class InvertRGBColors{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Number Of Terms Is = ");
        int NumberOfTerms = input.nextInt();
        System.out.printf("The Number Of Terms Is = %d%n", NumberOfTerms);
        int[] ArrayOfRGBColors = new int[NumberOfTerms];
        for(int i=0 ; i < NumberOfTerms ; i++){
            System.out.print("Please Enter A RGB Color ["+i+"]");
            ArrayOfRGBColors[i] = input.nextInt();
        }
        System.out.printf("The Array Of The R (Red) G (Green) B (Blue) Colors Is : %s%n", Arrays.toString(ArrayOfRGBColors));
        int[] InvertedArrayOfRGBColors = new int[ArrayOfRGBColors.length];
        for(int j=0 ; j < ArrayOfRGBColors.length ; j++){
            InvertedArrayOfRGBColors[j] = 255 - ArrayOfRGBColors[j];
        }
        System.out.printf("The Inverted Array Of R (Red) G (Green) B (Blue) Colors Is : %s%n", Arrays.toString(InvertedArrayOfRGBColors));
    }
}