/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.checkingstringforspaces;

/**
 *
 * @author moka
 */
// Write A Java Program To Get String From The User , And Then Check String 
// For Spaces =>
import java.util.Scanner;
public class CheckingStringForSpaces{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The String Is : ");
        String StringText = input.nextLine();
        System.out.printf("The String Text Is : %s%n", StringText);
        if(StringText.contains(" ")){
            System.out.println("It Is True... , Because It Contains Spaces Between Words...");
        }
        else{
            System.out.println("It Is False... , Because It Does Not Contain Any Spaces Between Words...");
        }
    }
}