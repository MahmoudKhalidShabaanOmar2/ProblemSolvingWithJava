/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingfinalpointsscoredinbasketballgame;

/**
 *
 * @author moka
 */
// Write A Java Program To Get The Total Points Of The BasketBall Game , 
// Given The Amount Of 2-Pointers Scored , And 3-Pointers Scored =>
import java.util.Scanner;
public class DisplayingFinalPointsScoredInBasketBallGame{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Total Points Of The Two Pointers Is = ");
        int TotalPointsOfTwoPointers = input.nextInt();
        System.out.println("The Total Points Of The Two Pointers Is = "+TotalPointsOfTwoPointers);
        System.out.print("Please Enter The Total Points Of The Three Pointers Is = ");
        int TotalPointsOfThreePointers = input.nextInt();
        System.out.println("The Total Points Of The Three Pointers Is = "+TotalPointsOfThreePointers);
        int TotalPointsOfPointersScoreed = TotalPointsOfTwoPointers * 2 + TotalPointsOfThreePointers * 3;
        System.out.println("The Total Points Of Pointers Scoreed Is = "+TotalPointsOfPointersScoreed);
    }
}