/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.xsandosnobodyknows;

/**
 *
 * @author moka
 */
// Write A Java Program To Get A Word From The User , And Then Checking =>
// If The Number Of X's Is Equal To Number Of O's , Then Returning True.
// Else The Number Of X's Is Not Equal To Number Of O's , Then Returning False. =>
import java.util.Scanner;
public class XSAndOSNoBodyKnows{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Word Is : ");
        String word = input.next();
        System.out.printf("The Word Is : %s%n", word);
        int NumberOfXS = 0;
        int NumberOfOS = 0;
        for(int i = 0 ; i < word.length() ; i++){
            if(word.charAt(i) == 'x' || word.charAt(i) == 'X'){
                NumberOfXS++;
            }
            if(word.charAt(i) == 'o' || word.charAt(i) == 'O'){
                NumberOfOS++;
            }
        }
        System.out.printf("The Length Of X\'s In The Word Is : %d%n", NumberOfXS);
        System.out.printf("The Number Of O\'S In The Word Is : %d%n", NumberOfOS);
        if(NumberOfXS == NumberOfOS){
            System.out.println("It Is TRUE.....");
        }
        else{
            System.out.println("It Is FALSE.....");
        }
    }
}