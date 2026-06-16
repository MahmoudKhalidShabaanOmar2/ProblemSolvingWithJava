/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.adayatthemarket;

/**
 *
 * @author moka
 */
// Write A Java Program To Display The Name Of The Man Who Can Bring The Most Items 
// Getting Bill Amount Of Money , Will Amount Of Inventory Spaces , Item's Price And
// Finally Items Size , BillItems = BillMoney / BillItemPrice , And Finally 
// WillItem = WillSpace / WillSize =>
import java.util.Scanner;
public class ADayAtTheMarket{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Bill Amount Of Money Is = ");
        int BillAmountOfMoney = input.nextInt();
        System.out.printf("The Bill Amount Of Money Is = %d%n", BillAmountOfMoney);
        System.out.print("Please Enter The Item's Price Is = ");
        int ItemPrice = input.nextInt();
        System.out.printf("The Item Price Is = %d%n", ItemPrice);
        int BillItems = BillAmountOfMoney / ItemPrice;
        System.out.printf("The Bill Items Is = %d%n", BillItems);
        System.out.print("Please Enter The Will Inventory Space Is = ");
        int WillInventorySpace = input.nextInt();
        System.out.printf("The Will Inventory Space Is = %d%n", WillInventorySpace);
        System.out.print("Please Enter The Item\'s Size Is = ");
        int ItemSize = input.nextInt();
        System.out.printf("The Item\'s Size Is = %d%n", ItemSize);
        int WillItems = WillInventorySpace / ItemSize;
        System.out.printf("The Will Items Is = %d%n", WillItems);
        if(BillItems > WillItems){
            System.out.println("BILL....");
        }
        else if(WillItems > BillItems){
            System.out.println("WILL....");
        }
        else{
            System.out.println("Tie....");
        }
    }
}