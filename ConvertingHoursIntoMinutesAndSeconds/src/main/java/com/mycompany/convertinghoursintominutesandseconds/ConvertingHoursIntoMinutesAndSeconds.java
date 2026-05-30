/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.convertinghoursintominutesandseconds;

/**
 *
 * @author moka
 */
// Write A Java Program To Converting Hours Into Minutes And Seconds =>
import java.util.Scanner;
public class ConvertingHoursIntoMinutesAndSeconds{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Number Of Hours Is = ");
        float NumberOfHours = input.nextFloat();
        System.out.printf("The Number Of Hours Is = %f%n",NumberOfHours);
        float NumberOfMinutes = NumberOfHours * 60;
        System.out.printf("The Number Of Minutes Is = %f%n",NumberOfMinutes);
        float NumberOfSeconds = NumberOfHours * 60 * 60;
        System.out.printf("The Number Of Seconds Is = %f%n",NumberOfSeconds);
    }
}