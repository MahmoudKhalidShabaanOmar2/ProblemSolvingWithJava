/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingmeasurementvaluefrominchestofeet;

/**
 *
 * @author moka
 */
// write a java program to get the measurement value into feet from the inche =>
import java.util.Scanner;
public class DisplayingMeasurementValueFromInchesToFeet{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Please Enter The Measurement In Inche Is = ");
    int MeasurementInInche = input.nextInt();
    System.out.println("The Measurement In Inche Is = "+MeasurementInInche);
    int MeasurementInFeet = MeasurementInInche / 12;
    System.out.println("The Measurement In Feet Is = "+MeasurementInFeet);
    }
}
