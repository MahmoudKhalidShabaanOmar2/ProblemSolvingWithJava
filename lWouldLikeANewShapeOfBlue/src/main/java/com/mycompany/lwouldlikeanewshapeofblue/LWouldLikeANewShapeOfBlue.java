/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lwouldlikeanewshapeofblue;

/**
 *
 * @author moka
 */
// Write A Java Program To Calculate The Number Of Walls That Can Paint , Dependence On 
// The Number Of Meters , Width Of Wall , And Height Of Wall =>
import java.util.Scanner;
public class LWouldLikeANewShapeOfBlue{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Number Of Meters Is = ");
        float NumberOfMeters = input.nextFloat();
        System.out.printf("The Number Of Meters Is = %f%n", NumberOfMeters);
        System.out.print("Please Enter The Width Of The Wall Is = ");
        float WidthOfWall = input.nextFloat();
        System.out.printf("The Width Of The Wall Is = %f%n", WidthOfWall);
        System.out.print("Please Enter The Height Of The Wall Is = ");
        float HeightOfWall = input.nextFloat();
        System.out.printf("The Height Of The Wall Is = %f%n", HeightOfWall);
        float NumberOfPaintedWalls = NumberOfMeters / (WidthOfWall * HeightOfWall);
        System.out.printf("The Number Of Painted Walls Is = %d%n", (int) NumberOfPaintedWalls);
    }
}