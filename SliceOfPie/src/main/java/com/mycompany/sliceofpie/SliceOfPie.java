/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sliceofpie;

/**
 *
 * @author moka
 */
// Write A Java Program To Calculate The Total Number Of Pices For Different 
// Recipients =>
import java.util.Scanner;
public class SliceOfPie{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Total Number Of Slices From The Pie Is = ");
        int NumberOfSlices = input.nextInt();
        System.out.printf("The Number Of Slices Of The Pie Is = %d%n", NumberOfSlices);
        System.out.print("Please Enter The Number Of Recipients Is = ");
        int NumberOfRecipients = input.nextInt();
        System.out.printf("The Number Of Recipients Is = %d%n", NumberOfRecipients);
        System.out.print("Please Enter The Number Of Slices For Each Recipients Is = ");
        int NumberOfSlicesForEachRecipients = input.nextInt();
        System.out.printf("The Number Of Slices For Each Recipients Is = %d%n", NumberOfSlicesForEachRecipients);
        if(NumberOfSlices == NumberOfRecipients * NumberOfSlicesForEachRecipients){
            System.out.printf("It Is True , Because Any Recipients Get %d%n", NumberOfSlices / NumberOfRecipients);
        }
        else{
            System.out.printf("It Is False , Because Any Recipients Get %d%n", NumberOfSlices / NumberOfRecipients);
        }
    }
}