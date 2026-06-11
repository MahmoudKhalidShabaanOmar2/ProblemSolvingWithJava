/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hasspaces;

/**
 *
 * @author moka
 */
// Write A Java Program To Get String , And Then Check For Spaces =>
import java.util.Scanner;
public class HasSpaces{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The String Is : ");
        String StringText = input.nextLine();
        System.out.printf("The String Text Is : %s%n", StringText);
        if(StringText.contains(" ")){
            System.out.println("It Is TRUE...");
        }
        else{
            System.out.println("It Is FALSE...");
        }
    }
}