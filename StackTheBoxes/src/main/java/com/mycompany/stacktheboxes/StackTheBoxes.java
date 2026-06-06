/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stacktheboxes;

/**
 *
 * @author moka
 */
// Write A Java Program To Get The Number Of Cubes , And Then Displaying 
// The Number Of Stacked Boxes =>
import java.util.Scanner;
public class StackTheBoxes{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Number Of Cubes Is = ");
        int NumberOfCubes = input.nextInt();
        System.out.printf("The Number Of Cubes Is = %d%n", NumberOfCubes);
//        int NumberOfStackBoxes = NumberOfCubes * NumberOfCubes;
          int NumberOfStackBoxes = (int) Math.pow(NumberOfCubes, 2);
        System.out.printf("The Number Of Stack Boxes Is = %d%n", NumberOfStackBoxes);
    }
}
