/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.addaconsuctivelistofnumbers;

/**
 *
 * @author moka
 */
// Write  A Java Program To Get Number From The User , And Then Get The Addition
// Of The Consuctive List Of Numbers =>
import java.util.Scanner;
public class AddAConsuctiveListOfNumbers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Number Is = ");
        int Number = input.nextInt();
        System.out.printf("The Number Is = %d%n", Number);
        int SumOfListOfNumbers = 0;
        for (int i = 0 ; i <= Number ; i++){
            SumOfListOfNumbers += i;
        }
        System.out.printf("The Sum Of All Numbers Is = %d%n", SumOfListOfNumbers);
    }
}