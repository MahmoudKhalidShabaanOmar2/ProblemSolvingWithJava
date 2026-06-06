/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingnumbersofstickersincube;

/**
 *
 * @author moka
 */
// Write A Java Program To Get Number Of Faces Of The Cube , And Then Calculate
// The Number Of Stickers Of The Cube =>
import java.util.Scanner;
public class DisplayingNumbersOfStickersInCube{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Number Of Faces Of The Cube Is = ");
        int NumberOfFacesInCube = input.nextInt();
        System.out.printf("The Number Of Faces Of The Cube Is = %d%n", NumberOfFacesInCube);
        int NumberOfStickersInCube = NumberOfFacesInCube * NumberOfFacesInCube * 6;
        System.out.printf("The Number Of Stickers In The Cube Is = %d%n", NumberOfStickersInCube);
    }
}