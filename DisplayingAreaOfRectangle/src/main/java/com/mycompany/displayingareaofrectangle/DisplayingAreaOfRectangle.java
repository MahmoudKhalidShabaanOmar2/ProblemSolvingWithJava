/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingareaofrectangle;

/**
 *
 * @author moka
 */
// Write A Java Program To Display The Area Of The Rectangle , You Should Take Care
// That The Rectangle Width , And Rectangle Length Should Be Grater Than Zero =>
import java.util.Scanner;
public class DisplayingAreaOfRectangle{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Rectangle Width Is = ");
        float RectangleWidth = input.nextFloat();
        System.out.printf("The Rectangle Width Is = %f%n", RectangleWidth);
        System.out.print("Please Enter The Rectangle Length Is = ");
        float RectangleLength = input.nextFloat();
        System.out.printf("The Rectangle Length Is = %f%n", RectangleLength);
        float RectangleArea;
        if((RectangleWidth > 0) && (RectangleLength > 0)){
            RectangleArea = RectangleWidth * RectangleLength;
            System.out.printf("The Rectangle Area Is = %f%n", RectangleArea);
            System.out.printf(", Because This Is Valid Arguements Like: %n");
            System.out.printf("(The Rectangle Length Is = %f%n",RectangleLength);
            System.out.printf("The Rectangle Width Is = %f%n", RectangleWidth);
        }
        else{
            RectangleArea = -1f;
            System.out.printf("The Rectangle Area Is = %f%n", RectangleArea);
            System.out.printf(", Because This Is Invalid Arguements Like: %n");
            System.out.printf("The Rectangle Length Is = %f%n ",RectangleLength);
            System.out.printf(" , And The Rectangle Width Is = %f%n", RectangleWidth);
        }
    }
}