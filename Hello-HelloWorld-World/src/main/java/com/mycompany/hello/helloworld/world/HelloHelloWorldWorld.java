/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hello.helloworld.world;

/**
 *
 * @author moka
 */
// Write A Java Program To Get A Number From The User , And Then Check 
// If The Number Is Multiple Of 3 (Modulus Of Number By 3 = 0) , Then Display Hello.
// If The Number Is Multiple Of 5 (Modulus Of Number By 5 = 0) , Then Display World.
// If The Number Is Multiple Of 3 , And The Number Is Multiple Of 5 , Then Display Hello World.
import java.util.Scanner;
public class HelloHelloWorldWorld{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter A Positive Integer Number Is = ");
        int PositiveIntegerNumber = input.nextInt();
        System.out.printf("The Positive Integer Number Is = %d%n", PositiveIntegerNumber);
        if((PositiveIntegerNumber > 0) && (PositiveIntegerNumber %3 == 0) && (PositiveIntegerNumber %5 == 0)){
            System.out.println("Hello World...");
        }
        else if((PositiveIntegerNumber > 0) && (PositiveIntegerNumber %3 == 0)){
            System.out.println("Hello...");
        }
        else if((PositiveIntegerNumber > 0) && (PositiveIntegerNumber %5 == 0)){
            System.out.println("World...");
        }
        else{
            System.out.println("Please Enter Other Positive Integer Number...");
        }
    }
}