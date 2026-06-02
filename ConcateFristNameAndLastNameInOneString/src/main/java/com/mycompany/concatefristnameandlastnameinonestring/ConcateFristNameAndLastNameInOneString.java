/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.concatefristnameandlastnameinonestring;

/**
 *
 * @author moka
 */
// Write A Java Program To Get Frist Name , And Last Name From The User
//, And Then Concate Them Into One String =>
import java.util.Scanner;
public class ConcateFristNameAndLastNameInOneString{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Frist Name Is : ");
        String FristName = input.next();
        System.out.printf("The Frist Name Is : %s%n", FristName);
        System.out.print("Please Enter The Second Name Is : ");
        String SecondName = input.next();
        System.out.printf("The Second Name Is : %s%n", SecondName);
        String ConcatenationOfFristNameAndSecondName = FristName + " " + SecondName;
        System.out.printf("The Concatenation Of Frist Name And "
        + "Second Name Is : %s%n",ConcatenationOfFristNameAndSecondName);
    }
}