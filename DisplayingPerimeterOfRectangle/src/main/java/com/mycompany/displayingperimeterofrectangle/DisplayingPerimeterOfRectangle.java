/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingperimeterofrectangle;

/**
 *
 * @author moka
 */
// Write A Java Program To Display The Perimeter Of The Rectangle =>
import java.util.Scanner;
public class DisplayingPerimeterOfRectangle{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Rectangle Length Is = ");
        float rectangleLength = input.nextFloat();
        System.out.printf("The Rectangle Length Is = %f", rectangleLength);
        System.out.print("\nPlease Enter The Rectangle Width Is = ");
        float rectangleWidth = input.nextFloat();
        System.out.printf("The Rectangle Width Is = %f", rectangleWidth);
        float rectanglePerimeter = 2 * (rectangleWidth + rectangleLength);
        System.out.printf("\nThe Rectangle Perimeter Is = %f", rectanglePerimeter);
    }
}