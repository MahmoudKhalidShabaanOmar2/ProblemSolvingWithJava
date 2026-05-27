/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingnamegreeting;

/**
 *
 * @author moka
 */
// Write A Java Program To Display The Name Greeting =>
import java.util.Scanner;
public class DisplayingNameGreeting{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter The User Name Is : ");
        String userName = input.nextLine();
        System.out.printf("\nThe User Name Is : %s%n", userName);
        System.out.printf("\nHello %s%n", userName);
    }
}