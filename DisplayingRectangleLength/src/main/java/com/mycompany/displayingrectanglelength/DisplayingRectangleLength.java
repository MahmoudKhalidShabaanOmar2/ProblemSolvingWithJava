/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingrectanglelength;

/**
 *
 * @author moka
 */
// Write A Java Program To Get The Rectangle Area , And Rectangle Width From The 
// User , And Then Displaying Rectangle Length =>
import java.util.Scanner;
public class DisplayingRectangleLength{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Rectangle Area Is = ");
        float RectangleArea = input.nextFloat();
        System.out.printf("The Rectangle Area Is = %f%n", RectangleArea);
        System.out.print("Please Enter The Rectangle Width Is = ");
        float RectangleWidth = input.nextFloat();
        System.out.printf("The Rectangle Width Is = %f%n", RectangleWidth);
        float RectangleLength = RectangleArea / RectangleWidth;
        System.out.printf("The Rectangle Length Is = %f%n", RectangleLength);
    }
}