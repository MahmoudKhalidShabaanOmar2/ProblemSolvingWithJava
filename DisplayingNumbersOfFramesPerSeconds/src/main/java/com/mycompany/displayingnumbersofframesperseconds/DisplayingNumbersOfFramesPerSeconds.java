/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingnumbersofframesperseconds;

/**
 *
 * @author moka
 */
// Write A Java Program To Display The Number Of Frames Per Seconds =>
import java.util.Scanner;
public class DisplayingNumbersOfFramesPerSeconds{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Number Of Minutes Is = ");
        int NumberOfMinutes = input.nextInt();
        System.out.printf("The Number Of Minutes Is = %d%n", NumberOfMinutes);
        System.out.print("Please Enter The Number Of Frames Per Second Is = ");
        int NumberOfFramesPerSecond = input.nextInt();
        System.out.printf("The Number Of Frames Per Seconds Is = %d%n",NumberOfFramesPerSecond);
        int DisplayingNumberOfFramesPerSeconds = 60 * NumberOfFramesPerSecond * NumberOfMinutes;
        System.out.println("The Number Of Frames Per Second (FPS) Is = "+DisplayingNumberOfFramesPerSeconds);
    }
}