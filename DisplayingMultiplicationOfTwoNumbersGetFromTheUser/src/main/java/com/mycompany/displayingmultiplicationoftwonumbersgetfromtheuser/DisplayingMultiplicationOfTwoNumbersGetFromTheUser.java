/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingmultiplicationoftwonumbersgetfromtheuser;

/**
 *
 * @author moka
 */
import java.util.Scanner;
public class DisplayingMultiplicationOfTwoNumbersGetFromTheUser{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Please Enter The Frist Number Is = ");
    int fristNum = input.nextInt();
    System.out.println("The Frist Number Is = "+fristNum);
    System.out.print("Please Enter The Second Number Is = ");
    int secondNum = input.nextInt();
    System.out.println("The Second Number Is = "+secondNum);
    int multiplicationOfTheTwoNumbers = fristNum * secondNum;
    System.out.println("The Multiplication Of The Two Numbers Is = "+multiplicationOfTheTwoNumbers);
    }
}