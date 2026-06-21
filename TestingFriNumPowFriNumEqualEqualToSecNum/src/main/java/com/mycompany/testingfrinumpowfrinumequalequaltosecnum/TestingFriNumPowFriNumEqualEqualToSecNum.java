/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testingfrinumpowfrinumequalequaltosecnum;

/**
 *
 * @author moka
 */
// Write A Java Program To Get Two Numbers From The User , And Then Check If 
// The Frist Number Power The Frist Number Is Equal Equal To Second Number =>
import java.util.Scanner;
public class TestingFriNumPowFriNumEqualEqualToSecNum{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Frist Number Is = ");
        int FriNum = input.nextInt();
        System.out.printf("The Frist Number Is = %d%n", FriNum);
        System.out.print("Please Enter The Second Number Is = ");
        int SecNum = input.nextInt();
        System.out.printf("The Second Number Is = %d%n", SecNum);
        if(Math.pow(FriNum, FriNum) == SecNum){
            System.out.println("It Is TRUE...");
        }
        else{
            System.out.println("It Is FALSE...");
        }
    }
}