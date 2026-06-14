/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingvolumeofbox;

/**
 *
 * @author moka
 */
// Write A Java Program To Display The Volume Of The Box , By The Getting 
// Three Arguements (Height , Width , And Length).
import java.util.Scanner;
public class DisplayingVolumeOfBox{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Height Of The Volume Is = ");
        float HeightOfBox = input.nextFloat();
        System.out.printf("The Height Of The Box Is = %f%n", HeightOfBox);
        System.out.print("Please Enter The Width Of The Box Is = ");
        float WidthOfBox = input.nextFloat();
        System.out.printf("The Width Of The Box Is = %f%n", WidthOfBox);
        System.out.print("Please Enter The Length Of The Box Is = ");
        float LengthOfBox = input.nextInt();
        System.out.printf("The Length Of The Box Is = %f%n", LengthOfBox);
        float VolumeOfBox = HeightOfBox * WidthOfBox * LengthOfBox;
        System.out.printf("The Volume Of The Box Is = %f%n", VolumeOfBox);
    }
}
