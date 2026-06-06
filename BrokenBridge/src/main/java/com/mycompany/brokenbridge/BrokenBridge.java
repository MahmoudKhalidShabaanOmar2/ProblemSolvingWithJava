/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.brokenbridge;

/**
 *
 * @author moka
 */
// Write A Java Program To Check If The Broken Bridge =>
import java.util.Scanner;
public class BrokenBridge{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The String Is : ");
        String str = input.nextLine();
        System.out.printf("The String Text Is = %s%n", str);
        System.out.println("Please Check The Broken Bridge Is : ");
        if(str.contains(" ")){
            System.out.println("It Is FALSE...");
        }
        else{
            System.out.println("It Is TRUE...");
        }
    }
}