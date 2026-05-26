/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingavotecounts;

/**
 *
 * @author moka
 */
// Write A Java Program To Count The Number Of Upvotes , And Downvotes That Should Be Displayed =>
import java.util.Scanner;
public class DisplayingAVoteCounts{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Number Of Up Votes Is = ");
        int numberOfUpVotes = input.nextInt();
        System.out.printf("The Number Of Up Votes Is = %d", numberOfUpVotes);
        System.out.print("\nPlease Enter The Number Of Down Votes Is = ");
        int numberOfDownVotes = input.nextInt();
        System.out.printf("The Number Of Down Votes Is = %d ", numberOfDownVotes);
        int totalNumberOfVotes = numberOfUpVotes - numberOfDownVotes;
        System.out.printf("\nThe Total Number Of Votes = %d",totalNumberOfVotes);
    }
}