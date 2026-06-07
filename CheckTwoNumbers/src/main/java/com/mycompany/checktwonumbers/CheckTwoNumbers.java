/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.checktwonumbers;

/**
 *
 * @author moka
 */
// Write A Java Program To Get Two Numbers From The User , And Then Return 
// True if The Two Numbers Is Grater Than Zero , Or The Two Numbers Is Equal To 
// Zero , And Return False If One Of The Two Numbers Is Grater Than Zero , And 
// Other Number Is Less Than Zero , Or Equal To Zero =>
import java.util.Scanner;
public class CheckTwoNumbers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Frist Number Is = ");
        int FristNumber = input.nextInt();
        System.out.printf("The Frist Number Is = %d%n", FristNumber);
        System.out.print("Please Enter The String Number Is = ");
        int SecondNumber = input.nextInt();
        System.out.printf("The Second Number Is = %d%n", SecondNumber);
        if(((FristNumber ==0) && (SecondNumber == 0)) || ((FristNumber > 0) && (SecondNumber > 0)) ){
            System.out.println("It Is True");
        }
        else{
            System.out.println("It Is False");
        }
    }
}