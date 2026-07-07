/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fizzbuzzinterviewquestion;

/**
 *
 * @author moka
 */
// Write A Java Program To Get Number From The User , And Then Displaying 
// "FIZZ" If The Number Is Multiple By Three.
// "BUZZ" If The Number Is Multiple By Five.
// "FIZZBUZZ" If The Number Is Multiple By Both Three , And Five.
// If The Number Is Not Multiple By Three , Or Five , Then Displaying
// Number As String =>
import java.util.Scanner;
public class FizzBuzzInterviewQuestion{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Given Number Is = ");
        int GivenNumber = input.nextInt();
        System.out.printf("The Given Number Is = %d%n", GivenNumber);
        if((GivenNumber > 0) && (GivenNumber %3 == 0) && (GivenNumber %5 == 0)){
            System.out.println("It Is FIZZBUZZ...");
        }
        else if((GivenNumber > 0) && (GivenNumber %5 == 0)){
            System.out.println("It Is BUZZ...");
        }
        else if((GivenNumber > 0) && (GivenNumber %3 == 0)){
            System.out.println("It Is FIZZ...");
        }
        else if((GivenNumber > 0) && (GivenNumber %3 != 0) && (GivenNumber %5 != 0)){
            System.out.println(Integer.toString(GivenNumber));
        }
        else{
            System.out.println("Please Enter An Positive Integer Number.....");
        }
    }
}