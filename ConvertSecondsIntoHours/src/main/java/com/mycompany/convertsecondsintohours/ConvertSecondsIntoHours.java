/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.convertsecondsintohours;

/**
 *
 * @author moka
 */
// Write A Java Program To Convert Seconds Into Hours =>
import java.util.Scanner;
public class ConvertSecondsIntoHours{
    public static void main(String[] args){
    System.out.print("Please Enter The Number Of Seconds Is = ");
    Scanner input = new Scanner(System.in);
    int seconds = input.nextInt();
    System.out.println("The Number Of Seconds Is = "+seconds);
    float hours = seconds / (60 * 60);
    System.out.printf("The Number Of Hours Is = %f",hours);
    
    }
}