/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.makingshufflethename;

/**
 *
 * @author moka
 */
// Write A Java Program To Get A Frist Name , And A Second Name From The User 
// And Then Swapping The Frist Name , And Second Name , And Finally Displaying
// The Full Name Again =>
import java.util.Scanner;
import java.util.Arrays;
public class MakingShuffleTheName{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Full Name Is : ");
        String FullName = input.nextLine();
        System.out.printf("The Full Name Is : %s%n", FullName);
        String[] ArrayOfNames = FullName.trim().split("\\s");
        System.out.printf("The Array Of Names Of The Full Name Is : %s%n", Arrays.toString(ArrayOfNames));
        System.out.printf("The Frist Name From The Full Name Is : %s%n", ArrayOfNames[0]);
        System.out.printf("The Second Name From The Full Name Is : %s%n", ArrayOfNames[1]);
        String SwappingFullName = ArrayOfNames[1] + " " + ArrayOfNames[0];
        System.out.printf("The Swapping Of The Full Name Is : %s%n", SwappingFullName);
    }
}