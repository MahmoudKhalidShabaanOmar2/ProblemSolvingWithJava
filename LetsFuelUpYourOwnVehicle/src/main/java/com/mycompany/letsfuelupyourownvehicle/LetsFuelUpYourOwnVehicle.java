/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.letsfuelupyourownvehicle;

/**
 *
 * @author moka
 */
// Write A Java Program To Get The Distance From The User To Calculate The Amount
// Of The Fuel Needs To The Given Distance =>
import java.util.Scanner;
public class LetsFuelUpYourOwnVehicle{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Distance In KiloMeters Is = ");
        float DistanceInKiloMeters = input.nextFloat();
        System.out.printf("The Distance In KileMeters Is = %f%n", DistanceInKiloMeters);
        float AmountOfFuelNeeds = DistanceInKiloMeters * 10;
        System.out.printf("The Amount Of Fuel That Needs Is = %f%n", AmountOfFuelNeeds);
    }
}