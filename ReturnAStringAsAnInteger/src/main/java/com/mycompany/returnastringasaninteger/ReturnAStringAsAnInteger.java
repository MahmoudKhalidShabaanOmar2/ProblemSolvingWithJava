/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.returnastringasaninteger;

/**
 *
 * @author moka
 */
// Write A Java Program To Get A String Number From The User , And Then Converted
// To An Integer Number =>
import java.util.Scanner;
public class ReturnAStringAsAnInteger{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The String Number Is : ");
        String StringNumber = input.next();
        System.out.printf("The String Number Is : %s%n", StringNumber);
        int IntegerNumber = Integer.parseInt(StringNumber);
        System.out.printf("The Integer Number Is = %d%n", IntegerNumber);
    }
}