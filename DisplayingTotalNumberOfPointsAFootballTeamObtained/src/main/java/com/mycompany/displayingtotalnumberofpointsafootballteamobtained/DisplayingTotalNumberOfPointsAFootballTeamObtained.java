/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingtotalnumberofpointsafootballteamobtained;

/**
 *
 * @author moka
 */
// Write A Java Program To Calculate The Total Number Of Points Can Be Obtained By A Football Team 
// By Takes The Number Wins Matches , Draws Matches , And Finally Loose Matches =>
import java.util.Scanner;
public class DisplayingTotalNumberOfPointsAFootballTeamObtained{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Number Of Football Matches Win Is = ");
        int NumberOfFootballMatchWins = input.nextInt();
        System.out.printf("The Number Of The Football Match Wins Is = %d%n", NumberOfFootballMatchWins);
        System.out.print("Please Enter The Number Of Football Matches Draw Is = ");
        int NumberOfFootballMatchDraws = input.nextInt();
        System.out.printf("The Number Of Football Match Draw Is = %d%n", NumberOfFootballMatchDraws);
        System.out.print("Please Enter The Number Of Football Matches Loose Is = ");
        int NumberOfFootballMatchLooses = input.nextInt();
        System.out.printf("The Number Of Football Matches Looses Is = %d%n", NumberOfFootballMatchLooses);
        int TotalNumberOfPoints = NumberOfFootballMatchWins * 3 + NumberOfFootballMatchDraws * 1 + NumberOfFootballMatchLooses * 0;
        System.out.printf("The Total Points Is = %d%n",TotalNumberOfPoints);
    }
}