/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingareaandperimeterofrectangle;

/**
 *
 * @author moka
 */
// Write A Java Program To Get The Rectangle Width , And The Rectangle Length
// From The User , And Finally Displaying The Rectangle Area , And Also 
// Displaying The Rectangle Perimeter =>
import java.util.Scanner;
public class DisplayingAreaAndPerimeterOfRectangle{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Rectangle Width Is = ");
        float RectangleWidth = input.nextFloat();
        System.out.printf("The Rectangle Width Is = %f%n", RectangleWidth);
        System.out.print("Please Enter The Rectangle Length Is = ");
        float RectangleLength = input.nextFloat();
        System.out.printf("The Rectangle Length Is = %f%n", RectangleLength);
        float AreaOfRectangle = RectangleWidth * RectangleLength;
        System.out.printf("The Rectangle Area Is = %f%n", AreaOfRectangle);
        float PerimeterOfRectangle = 2 * (RectangleWidth + RectangleLength);
        System.out.printf("The Rectangle Perimeter Is = %f%n", PerimeterOfRectangle);
    }
}