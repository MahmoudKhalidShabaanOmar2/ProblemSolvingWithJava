/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingsumoftwonumbergetfromuser;

/**
 *
 * @author moka
 */
import java.util.Scanner;
public class DisplayingSumOfTwoNumberGetFromUser{
    public static void main(String[] args){
    System.out.print("Please Enter The Frist Number Is = ");
    Scanner input = new Scanner(System.in);
    int fristNum = input.nextInt();
    System.out.println("The Frist Number Is = "+fristNum);
    System.out.print("Please Enter The Second Number Is = ");
    int secondNum = input.nextInt();
    System.out.println("The Second Number Is = "+secondNum);
    int sumOfTwoNumbers = fristNum + secondNum;
    System.out.print("The Sum Of The Two Numbers Is = "+sumOfTwoNumbers);
    }
}