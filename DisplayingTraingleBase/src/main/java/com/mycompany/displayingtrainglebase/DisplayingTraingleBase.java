/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingtrainglebase;

/**
 *
 * @author moka
 */
// Write A Java Program To Get The Traingle Base , Depending On 
// The Area Of The Traingle , And The Height Of The Traingle =>
import java.util.Scanner;
public class DisplayingTraingleBase{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Traingle Area Is = ");
        float TraingleArea = input.nextFloat();
        System.out.printf("The Traingle Area Is = %f%n", TraingleArea);
        System.out.print("Please Enter The Traingle Height Is = ");
        float TraingleHeight = input.nextFloat();
        float TraingleBase = (TraingleArea / TraingleHeight) * 2;
        System.out.printf("The Traingle Base Is = %f%n", TraingleBase);
    }
}