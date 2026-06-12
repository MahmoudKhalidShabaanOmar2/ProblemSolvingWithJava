/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingonlydivisiblenumberbythreefromarrayofnumber;

/**
 *
 * @author moka
 */
import java.util.Scanner;
import java.util.Arrays;
public class DisplayingOnlyDivisibleNumberByThreeFromArrayOfNumber{
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
        System.out.printf("The Array Of All Numbers Is : %s%n", Arrays.toString(ArrayOfNumbers));
        System.out.println("The Divisible Numbers By Three Only From The Array Of All Numbers Is : ");
        for(int j = 0 ; j < NumberOfTerms ; j++){
            if(ArrayOfNumbers[j] %3 == 0){
                System.out.println(ArrayOfNumbers[j]);
            }
        }
    }
}
