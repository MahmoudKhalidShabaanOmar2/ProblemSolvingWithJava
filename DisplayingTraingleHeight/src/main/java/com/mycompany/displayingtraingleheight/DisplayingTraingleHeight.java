/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingtraingleheight;

/**
 *
 * @author moka
 */
// Write A Java Program To Get The Traingle Height Depending On 
// The Area Of The Traingle , And The Base Of The Traingle =>
import java.util.Scanner;
public class DisplayingTraingleHeight{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Traingle Area Is = ");
        float TraingleArea = input.nextFloat();
        System.out.printf("The Traingle Area Is = %f%n", TraingleArea);
        System.out.print("Please Enter The Base Of The Traingle Is = ");
        float TraingleBase = input.nextFloat();
        System.out.printf("The Traingle Base Is = %f%n", TraingleBase);
        float TraingleHeight = (TraingleArea / TraingleBase) * 2;
        System.out.printf("The Traingle Height Is = %f%n", TraingleHeight);
    }
}