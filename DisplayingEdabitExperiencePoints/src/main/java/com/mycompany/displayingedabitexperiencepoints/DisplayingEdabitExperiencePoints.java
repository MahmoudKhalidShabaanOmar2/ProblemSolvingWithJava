/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingedabitexperiencepoints;

/**
 *
 * @author moka
 */
// Write A Java Program To Given Array Of How Many Challenges A Person Has Been 
// Completed Depending On The Level Of Difficulty , Return How Many Points =>
// VeryEasy = 5XP. // Easy = 10XP. // Medium = 20XP. // Hard = 40XP. // VeryHard = 80XP.
import java.util.Scanner;
import java.util.Arrays;
public class DisplayingEdabitExperiencePoints{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Number Of Terms Is = ");
        int NumberOfTerms = input.nextInt();
        System.out.printf("The Number Of Terms Is = %d%n", NumberOfTerms);
        int[] ArrayOfNumberOfPersons = new int[NumberOfTerms];
        for (int i = 0 ; i < NumberOfTerms ; i++){
            System.out.print("Please Enter The Number ("+i+") Is = ");
            ArrayOfNumberOfPersons[i] = input.nextInt();
        }
        System.out.printf("The Array Of Number Of Persons Is : %s%n", Arrays.toString(ArrayOfNumberOfPersons));
        int[] ArrayOfDifficultyPoints = {5 , 10 , 20 , 40 , 80};
        System.out.printf("The Array Of Difficulty Points Is : %s%n", Arrays.toString(ArrayOfDifficultyPoints));
        int SumOfAllEdabitExperiencePoints = 0;
        for (int j = 0 ; j < NumberOfTerms ; j++){
            SumOfAllEdabitExperiencePoints += ArrayOfNumberOfPersons[j] * ArrayOfDifficultyPoints[j];
        }
        System.out.printf("The Total Edabit Experience Points Is = %d%n \"", SumOfAllEdabitExperiencePoints,"\"");
    }
}