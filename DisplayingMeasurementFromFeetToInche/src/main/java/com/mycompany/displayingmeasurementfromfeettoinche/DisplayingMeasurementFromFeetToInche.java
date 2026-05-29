/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingmeasurementfromfeettoinche;

/**
 *
 * @author moka
 */
// Write A Java Program To Display The Measurement From Feet To Inche =>
import java.util.Scanner;
public class DisplayingMeasurementFromFeetToInche{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Measurement Into Feet Is = ");
        int MeasurementIntoFeet = input.nextInt();
        System.out.println("The Measurement Into Feet Is = "+MeasurementIntoFeet);
        int MeasurementIntoInche = MeasurementIntoFeet * 12;
        System.out.println("The Measurement Into Inche Is = "+MeasurementIntoInche);
    }
}