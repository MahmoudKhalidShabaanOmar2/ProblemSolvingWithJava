/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingtraingularsequencenumbers;

/**
 *
 * @author moka
 */
// Write A Java Program To Get Number Of Dots From The User , And Then Displaying
// The Traingular Sequence Numbers By Using The For Loop =>
import java.util.Scanner;
public class DisplayingTraingularSequenceNumbers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Number Of Dots Is = ");
        int NumberOfDots = input.nextInt();
        System.out.printf("The Number Of Dots Is = %d%n", NumberOfDots);
        int TraingularSequenceNumbers = 0;
        for(int i=0 ; i <= NumberOfDots ; i++){
           TraingularSequenceNumbers += i; 
        }
        System.out.printf("The Traingular Number Of Dots Is = %d%n", TraingularSequenceNumbers);
    }
}