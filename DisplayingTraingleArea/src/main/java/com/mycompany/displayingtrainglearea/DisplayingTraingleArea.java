/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingtrainglearea;

/**
 *
 * @author moka
 */
// Write A Java Program To Display The Traingle Area , Depending On 
// The Base Of The Traingle , And The Height Of The Traingle =>
import java.util.Scanner;
public class DisplayingTraingleArea{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Base Of The Traingle Is = ");
        float BaseOfTraingle = input.nextFloat();
        System.out.printf("The Base Of The Traingle Is = %f%n", BaseOfTraingle);
        System.out.print("Please Enter The Height Of The Traingle Is = ");
        float HeightOfTraingle = input.nextFloat();
        System.out.printf("The Height Of The Traingle Is = %f%n", HeightOfTraingle);
        float AreaOfTraingle = 0.5f * HeightOfTraingle * BaseOfTraingle;
        System.out.printf("The Area Of The Traingle Is = %f%n", AreaOfTraingle);
    }
}