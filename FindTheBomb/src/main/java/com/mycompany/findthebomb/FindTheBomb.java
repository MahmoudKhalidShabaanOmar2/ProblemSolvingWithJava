/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.findthebomb;

/**
 *
 * @author moka
 */
// Write A Java Program To Get A Sentence From The User (Not Case Sensitive) 
// If You Find "bomb" Word , Then Return "DUCK!".
// Otherwise Then Returning "Relax , There Is No bomb".
import java.util.Scanner;
public class FindTheBomb{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The String Sentence Is : ");
        String StringSentence = input.nextLine();
        System.out.printf("The String Sentence Is : %s%n", StringSentence);
        if(StringSentence.contains("bomb") || StringSentence.contains("Bomb") || StringSentence.contains("BOMB")){
            System.out.println("DUCK!....");
        }
        else{
            System.out.println("Relax , There Is No Bomb!");
        }
    }
}