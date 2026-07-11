/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.thethreeprogrammersproblem;

/**
 *
 * @author moka
 */
// Write A Java Program To Get Hyired Three Programmers , And You Hopefully Pay
// Them , Then Takes Three Numbers (The Hourly Wages Of Each Programmers) , And 
// Then Displaying The Difference Between The Highest Paid , And Lowest Paid =>
import java.util.Scanner;
public class TheThreeProgrammersProblem{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The The Frist Hyired Programmer Wages Hours Is = ");
        int FristHyiredProgrammerWagesHours = input.nextInt();
        System.out.printf("The Frist Hyired Programmer Wages Hours Is = %d%n", FristHyiredProgrammerWagesHours);
        System.out.print("Please Enter The Second Hyired Programmer Wages Hours Is = ");
        int SecondHyiredProgrammerWagesHours = input.nextInt();
        System.out.printf("The Second Hyired Programmer Wages Hours Is = %d%n", SecondHyiredProgrammerWagesHours);
        System.out.print("Please Enter The Third Hyired Programmer Wages Hours Is = ");
        int ThirdHyiredProgrammerWagesHours = input.nextInt();
        System.out.printf("The Third Hyired Programmer Wages Hours Is = %d%n", ThirdHyiredProgrammerWagesHours);
        if((FristHyiredProgrammerWagesHours >= 0) && (SecondHyiredProgrammerWagesHours >= 0) && (ThirdHyiredProgrammerWagesHours >= 0)){
            if((FristHyiredProgrammerWagesHours >= ThirdHyiredProgrammerWagesHours) && (SecondHyiredProgrammerWagesHours >= ThirdHyiredProgrammerWagesHours) && (FristHyiredProgrammerWagesHours >= SecondHyiredProgrammerWagesHours)){
                int DifferenceBetweenHighestAndLowestPaid = FristHyiredProgrammerWagesHours - SecondHyiredProgrammerWagesHours;
                System.out.printf("The Difference Between The Frist Hyired Programmer Wages Hours , And The Second Hyired Programmer Wages Hours Is = %d%n", DifferenceBetweenHighestAndLowestPaid);
            }
            else if((FristHyiredProgrammerWagesHours >= ThirdHyiredProgrammerWagesHours) && (SecondHyiredProgrammerWagesHours >= ThirdHyiredProgrammerWagesHours) && (SecondHyiredProgrammerWagesHours >= FristHyiredProgrammerWagesHours)){
                int DifferenceBetweenHighestAndLowestPaid = SecondHyiredProgrammerWagesHours - FristHyiredProgrammerWagesHours;
                System.out.printf("The Difference Between The Second Hyired Programmer Wages Hours , And The Frist Hyired Programmer Wages Hours Is = %d%n", DifferenceBetweenHighestAndLowestPaid);
            }
            else if((SecondHyiredProgrammerWagesHours >= FristHyiredProgrammerWagesHours) && (ThirdHyiredProgrammerWagesHours >= FristHyiredProgrammerWagesHours) && (SecondHyiredProgrammerWagesHours > ThirdHyiredProgrammerWagesHours)){
                int DifferenceBetweenHighestAndLowestPaid = SecondHyiredProgrammerWagesHours - ThirdHyiredProgrammerWagesHours;
                System.out.printf("The Difference Between The Second Hyired Programmer Wages Hours , And The Third Hyired Programmer Wages Hours Is = %d%n", DifferenceBetweenHighestAndLowestPaid);
            }
            else if((SecondHyiredProgrammerWagesHours >= FristHyiredProgrammerWagesHours)&& (ThirdHyiredProgrammerWagesHours > FristHyiredProgrammerWagesHours) && (ThirdHyiredProgrammerWagesHours > SecondHyiredProgrammerWagesHours)){
                int DifferenceBetweenHighestAndLowestPaid = ThirdHyiredProgrammerWagesHours - SecondHyiredProgrammerWagesHours;
                System.out.printf("The Difference Between The Third Hyired Programmer Wages Hours , And The Second Hyired Programmer Wages Hours Is %d%n", DifferenceBetweenHighestAndLowestPaid);
            }
            else if((ThirdHyiredProgrammerWagesHours >= FristHyiredProgrammerWagesHours) && (ThirdHyiredProgrammerWagesHours >= SecondHyiredProgrammerWagesHours) && (SecondHyiredProgrammerWagesHours > FristHyiredProgrammerWagesHours)){
                int DifferenceBetweenHighestAndLowestPaid = ThirdHyiredProgrammerWagesHours - SecondHyiredProgrammerWagesHours;
                System.out.printf("The Difference Between The Third Hyired Programmer Wages Hours , And The Secondary Hyired Programmer Wages Hours Is = %d%n", DifferenceBetweenHighestAndLowestPaid);
            }
            else{
                System.out.println("Not FOUND...");
            }
        }
        else{
            System.out.print("Please Enter A Valid Positive Hyired Programmer Wages Hours Only...");
        }
    }
}