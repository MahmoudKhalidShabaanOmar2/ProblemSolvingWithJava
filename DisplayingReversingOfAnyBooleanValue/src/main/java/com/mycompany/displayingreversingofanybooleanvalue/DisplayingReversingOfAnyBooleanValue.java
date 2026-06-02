/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingreversingofanybooleanvalue;

/**
 *
 * @author moka
 */
// Write A Java Program To Display The Reversing Of Any Boolean Value =>
import java.util.Scanner;
public class DisplayingReversingOfAnyBooleanValue{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Boolean Value Is: ");
        boolean BoolValue = input.nextBoolean();
        System.out.println("The Boolean Value Is : "+BoolValue);
        boolean ReveresingOfBoolValue = !BoolValue;
        System.out.println("The Reveresing Of The Accepted Boolean Value Is : "+ReveresingOfBoolValue);
    }
}