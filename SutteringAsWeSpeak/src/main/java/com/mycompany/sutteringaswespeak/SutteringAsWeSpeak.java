/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sutteringaswespeak;

/**
 *
 * @author moka
 */
// Write A Java Program To Get A Word From The Sentence , And Then
// Suttering The Word By Repeating The Frist Two Letters By Using 
// Elispes (...) Between The Frist Two Letters , And Then Displaying 
// The Suttering Word =>
import java.util.Scanner;
public class SutteringAsWeSpeak{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Word Is : ");
        String word = input.next();
        System.out.printf("The Word Is : %s%n", word);
        String SutteringWord = word.substring(0 , 2)+"... "+word.substring(0 , 2)+"... "+word;
        System.out.printf("The Suttering Of The Word Is : %s%n", SutteringWord);
    }
}