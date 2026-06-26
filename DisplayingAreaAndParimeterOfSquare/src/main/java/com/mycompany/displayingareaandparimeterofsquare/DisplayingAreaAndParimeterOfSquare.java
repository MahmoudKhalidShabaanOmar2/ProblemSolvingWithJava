/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingareaandparimeterofsquare;

/**
 *
 * @author moka
 */
// Write A Java Program To Get The Side Length Of The Square , And Then 
// Displaying The Area Of The Square , And Perimeter Of The Square.
import java.util.Scanner;
public class DisplayingAreaAndParimeterOfSquare{
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.print("Please Enter The Side Length Of The "
       + "Square Is = ");
       float SideLengthOfSquare = input.nextFloat();
       System.out.printf("The Side Length Of The Square "
       + "Is = %f%n", SideLengthOfSquare);
       float AreaOfSquare = SideLengthOfSquare * SideLengthOfSquare;
       System.out.printf("The Area Of The Square "
       + "Is = %f%n", AreaOfSquare);
       float PerimeterOfSquare = 4 * SideLengthOfSquare;
       System.out.printf("The Perimeter Of The Square "
       + "Is = %f%n", PerimeterOfSquare);
   }
}