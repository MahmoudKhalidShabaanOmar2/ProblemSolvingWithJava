/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.acceptedinmovietheatre;

/**
 *
 * @author moka
 */
// Write A Java Program To Check If The Person Accepted In Movie Theatre , Dependence On 
// The Age At Least 15 Years Old , And Check If The User IsSupervised =>
import java.util.Scanner;
public class AcceptedInMovieTheatre{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Your Current Age Is = ");
        float CurrentUserAge = input.nextFloat();
        System.out.printf("The Current User Age Is = %f%n", CurrentUserAge);
        System.out.print("Please Enter The Value Of Check Of The Supervised Is : ");
        boolean IsSupervised = input.nextBoolean();
        System.out.printf("The Value Of Check Of The Supervises Is : %b%n", IsSupervised);
        if((CurrentUserAge >= 15) && IsSupervised){
            System.out.println("It Is True... , Because ");
            System.out.printf("The Current User Age Is = %f%n", CurrentUserAge);
            System.out.print("It Is Supervised");
        }
        else{
            System.out.println("It Is False... , Because ");
            System.out.printf("The Current User Age Is = %f%n", CurrentUserAge);
            System.out.print("It Is Not Supervised");
        }
    }
}