/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prefixesvssuffixes;

/**
 *
 * @author moka
 */
// Write A Java Program To Get A Word , And Part Of Word From The Sentence , And
// Then Check 
// If The Part Of Word Existing In The Start Of The Word , Returning True.
// If The Part Of Word Existing In The End Of The Word , Returning True.
// If The Part Of Word Is Not Existing In The Start , Or End Of The Word Then 
// Returning False.
import java.util.Scanner;
public class PrefixesVSSuffixes{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Full Word Is : ");
        String FullWord = input.next();
        System.out.printf("The Full Word Is : %s%n", FullWord);
        System.out.print("Please Enter The Part Word Is : ");
        String PartWord = input.next();
        System.out.printf("The Part Word Is : %s%n", PartWord);
        if(FullWord.startsWith(PartWord)){
            System.out.println("Prefixes....");
        }
        else if(FullWord.endsWith(PartWord)){
            System.out.println("Suffixes....");
        }
        else{
            System.out.println("Not Found....");
        }
    }
}