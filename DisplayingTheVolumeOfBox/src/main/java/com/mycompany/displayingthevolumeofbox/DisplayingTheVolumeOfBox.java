/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingthevolumeofbox;

/**
 *
 * @author moka
 */
// Write A Java Program To Get The Volume Of The Box =>
import java.util.Scanner;
public class DisplayingTheVolumeOfBox{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Width Of The Box Is = ");
        float WidthOfBox = input.nextFloat();
        System.out.printf("The Width Of The Box Is = %f%n", WidthOfBox);
        System.out.print("Please Enter The Length Of The Box Is = ");
        float LengthOfBox = input.nextFloat();
        System.out.printf("The Length Of The Box Is = %f%n", LengthOfBox);
        System.out.print("Please Enter The Height Of The Box Is = ");
        float HeightOfBox = input.nextFloat();
        System.out.printf("The Height Of The Box Is = %f%n", HeightOfBox);
        float VolumeOfBox = WidthOfBox * LengthOfBox * HeightOfBox;
        System.out.printf("The Volume Of The Box Is = %f%n", VolumeOfBox);
    }
}
