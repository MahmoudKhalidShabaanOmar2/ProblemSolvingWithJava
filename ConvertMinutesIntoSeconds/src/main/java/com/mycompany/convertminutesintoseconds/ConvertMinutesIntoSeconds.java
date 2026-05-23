/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.convertminutesintoseconds;

/**
 *
 * @author moka
 */
// Write A Java Program To Get Minutes From The User , And Then Convert Into Seconds =>
import java.util.Scanner;
public class ConvertMinutesIntoSeconds{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("The Time Into Minutes Is = ");
        int timeInMinutes = input.nextInt();
        System.out.println("The Time In Minutes Is = "+timeInMinutes);
        int timeInSeconds = timeInMinutes * 60;
        System.out.println("The Time In Seconds Is = "+timeInSeconds);
    }
}