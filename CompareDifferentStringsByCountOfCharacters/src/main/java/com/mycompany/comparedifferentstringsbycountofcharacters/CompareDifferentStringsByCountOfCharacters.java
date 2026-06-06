/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.comparedifferentstringsbycountofcharacters;

/**
 *
 * @author moka
 */
// Write A Java Program To Compare A Count Of Characters Of Different Strings =>
import java.util.Scanner;
public class CompareDifferentStringsByCountOfCharacters{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Frist String Text Is : ");
        String FristString = input.nextLine();
        System.out.printf("The Frist String Text Is : %s%n", FristString);
        System.out.print("Please Enter The Second String Text Is : ");
        String SecondString = input.nextLine();
        System.out.printf("The Second String Text Is : %s%n", SecondString);
        int LengthOfFristString = FristString.length();
        System.out.printf("The Length Of The Frist String Text Is = %d%n", LengthOfFristString," Characters");
        int LengthOfSecondString = SecondString.length();
        System.out.printf("The Length Of The Second String Text Is = %d%n",LengthOfSecondString," Characters");
        if(LengthOfFristString == LengthOfSecondString){
            System.out.println("It Is TRUE...");
        }
        else{
            System.out.println("It Is FALSE...");
        }
        
    }
}
