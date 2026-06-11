/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingradianfromdegree;

/**
 *
 * @author moka
 */
// Write A Java Program To Get Angle Into Degree , And Then Converted Into Radian =>
import java.util.Scanner;
public class DisplayingRadianFromDegree{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Angle Into Radian Is = ");
        int AngleIntoRadian = input.nextInt();
        System.out.printf("The Angle Into Radian Is = %d%n" , AngleIntoRadian);
        double AngleIntoDegree = AngleIntoRadian * 180 / Math.PI;
        System.out.println("The Angle Into Degree Is = "+ AngleIntoDegree);
    }
}