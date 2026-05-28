/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.countingnumberoflegscanbecountedinhisanimals;

/**
 *
 * @author moka
 */
// Write A Java Program To Count The Number Of Legs Can Be Counted In His Animals 
// , The Farmer Breeds Three Spices (Chiken = 2 , Cows = 4 , Pigs = 4) =>
import java.util.Scanner;
public class CountingNumberOfLegsCanBeCountedInHisAnimals{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Number Of Chikens = ");
        int NumberOfChiken = input.nextInt();
        System.out.printf("The Number Of The Chiken Is = %d%n ", NumberOfChiken);
        System.out.print("Please Enter The Number Of Cows Is = ");
        int NumberOfCows = input.nextInt();
        System.out.printf("The Number Of Cows Is = %d%n ", NumberOfCows);
        System.out.print("Please Enter The Number Of Pigs Is = ");
        int NumberOfPigs = input.nextInt();
        System.out.printf("The Number Of Pigs Is = %d%n", NumberOfPigs);
        int TotalNumberOfLegsOfAnyAnimal = NumberOfCows * 4 + NumberOfChiken * 2 + NumberOfPigs * 4;
        System.out.printf("The Total Number Of Legs Of Any Animals In The Farm Is %d%n ", TotalNumberOfLegsOfAnyAnimal);
    }
}