/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingascillfromcharacter;

/**
 *
 * @author moka
 */
// Write A Java Program To Get A Character From The User , And Then Displaying 
// The ASCILL Code From The Character => 
import java.util.Scanner;
public class DisplayingAscillFromCharacter{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Character Is : ");
        char character = input.next().charAt(0);
        System.out.printf("The Character Is : %s%n", character);
        int AscillCode = (int) character;
        System.out.printf("The Ascill Code Is : %d%n", AscillCode);
    }
}