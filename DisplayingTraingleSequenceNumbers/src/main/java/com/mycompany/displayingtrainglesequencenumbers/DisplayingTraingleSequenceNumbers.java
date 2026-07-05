/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingtrainglesequencenumbers;

/**
 *
 * @author moka
 */
// Write A Java Program To Get A Number Of Dots , And Then Displaying 
// The Sequence Numbers Of Traingle By Using This Formula =>
// NumberOfDots * (NumberOfDots + 1) / 2 =>
import java.util.Scanner;
public class DisplayingTraingleSequenceNumbers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Number Of Dots Is = ");
        int NumberOfDots = input.nextInt();
        System.out.printf("The Number Of Dots Is = %d%n", NumberOfDots);
        int TraingularSequenceNumbers = (NumberOfDots * (NumberOfDots + 1)) / 2;
        System.out.printf("The Traingular Sequence Numbers Is = %d%n", TraingularSequenceNumbers);
    }
}