/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingrectanglewidth;

/**
 *
 * @author moka
 */
// Write A Java Program To Display The Width Of The Rectangle Depending On 
// The Rectangle Area , And Rectangle Length =>
import java.util.Scanner;
public class DisplayingRectangleWidth{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Rectangle Area Is = ");
        float RectangleArea = input.nextFloat();
        System.out.printf("The Rectangle Area Is = %f%n", RectangleArea);
        System.out.print("Please Enter The Rectangle Length Is = ");
        float RectangleLength = input.nextFloat();
        System.out.printf("The Rectangle Length Is = %f%n", RectangleLength);
        float RectangleWidth = RectangleArea / RectangleLength;
        System.out.printf("The Rectangle Width Is = %f%n", RectangleWidth);
    }
}