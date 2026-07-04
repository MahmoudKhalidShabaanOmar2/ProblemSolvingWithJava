/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingcubeofthesquarerootofthenumber;

/**
 *
 * @author moka
 */
// Write A Java Program To Get Number From The User , And Then Getting The Cube
// Of The Square Root Of Your Entered Number =>
import java.util.Scanner;
public class DisplayingCubeOfTheSquareRootOfTheNumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Number Is = ");
        int number = input.nextInt();
        System.out.printf("The Number Is = %d%n", number);
        double SquareRootOfNumber = Math.sqrt(number);
        System.out.printf("The Square Root Of The Number Is = %f%n", SquareRootOfNumber);
        double CubeOfSquareRootOfNumber = Math.pow(SquareRootOfNumber, 3);
        System.out.printf("The Cube Of The Square Root Of The Number Is = %f%n", CubeOfSquareRootOfNumber);
    }
}