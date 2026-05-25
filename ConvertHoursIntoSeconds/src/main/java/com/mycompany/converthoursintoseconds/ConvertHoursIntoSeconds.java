/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.converthoursintoseconds;

/**
 *
 * @author moka
 */
// Write A Java Program To Convert Hours Into Seconds =>
import java.util.Scanner;
public class ConvertHoursIntoSeconds{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Number Of Hours Is = ");
        float hours = input.nextFloat();
        System.out.printf("The Number Of Hours Is = %f",hours);
//        float seconds = hours * (60 * 60);
        float seconds = hours * 3600;
        System.out.printf("\nThe Number Of Seconds Is = %f", seconds);
    }
}