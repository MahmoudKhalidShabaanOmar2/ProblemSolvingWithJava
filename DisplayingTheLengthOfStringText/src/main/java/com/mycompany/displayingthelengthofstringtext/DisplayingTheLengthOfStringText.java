/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingthelengthofstringtext;

/**
 *
 * @author moka
 */
// Write A Java Program To Get The String Text From The User , And Then 
// Count The Length Of The String Text =>
import java.util.Scanner;
public class DisplayingTheLengthOfStringText{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The String Text Is : ");
        String StringText = input.nextLine();
        System.out.printf("The String Text Is : %s%n", StringText);
        int LengthOfStringText = StringText.length();
        System.out.println("The Length Of The String Text Is = "+ LengthOfStringText+ " Characters");
        
    }
}