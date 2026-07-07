/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.capturetherook;

/**
 *
 * @author moka
 */
// Write A Java Program To Get Two Rooks From The User , And Finally Displaying 
// True If The Two Rooks Can Attack Each Other , Otherwise False =>
import java.util.Scanner;
public class CaptureTheRook{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Frist Position Is : ");
        String FristPosition = input.next();
        System.out.printf("The Frist Position Is : %s%n", FristPosition);
        char FristLetter = FristPosition.charAt(0);
        System.out.printf("The Frist Letter From The Frist Position Is : %s%n", FristLetter);
        char FristNumber = FristPosition.charAt(1);
        System.out.printf("The Frist Number From The Frist Position Is : %s%n", FristNumber);
        System.out.print("Please Enter The Second Position Is : ");
        String SecondPosition = input.next();
        System.out.printf("The Second Position Is : %s%n", SecondPosition);
        char SecondLetter = SecondPosition.charAt(0);
        System.out.printf("The Second Letter From The Second Position Is : %s%n", SecondLetter);
        char SecondNumber = SecondPosition.charAt(1);
        System.out.printf("The Second Number From The Second Position Is : %s%n", SecondNumber);
        if((FristLetter == SecondLetter) || (FristNumber == SecondNumber)){
            System.out.println("It Is TRUE...");
        }
        else{
            System.out.println("It Is FALSE...");
        }
    }
}