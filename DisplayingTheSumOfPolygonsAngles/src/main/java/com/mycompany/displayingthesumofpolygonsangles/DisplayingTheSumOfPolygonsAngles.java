/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingthesumofpolygonsangles;

/**
 *
 * @author moka
 */
// Write A Java Program To Display By Given n-Sided Polygons To Get The Sum Of The Polygons Angles 
// By Using The Formula (n - 2) *180 =>
import java.util.Scanner;
public class DisplayingTheSumOfPolygonsAngles{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Number Of Angle Is = ");
        int NumberOfAngle = input.nextInt();
        System.out.printf("The Number Of Angle Is = %d%n", NumberOfAngle);
        int SumOfPolygonsAngles = (NumberOfAngle - 2) * 180;
        System.out.printf("The Sum Of The Polygons Angles Is = %d%n", SumOfPolygonsAngles);
    }
}