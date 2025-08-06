/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.icetask2.prog6112.st10321672;

/**
 *
 * @author RC_Student_lab
 */
public class Main {

    public static void main(String[] args) {

        int[][] numbers = {{8, 2, 5}, {5, 5, 3}, {7, 7, 2}, {8, 9, 10}, {7, 4, 3}, {7, 8, 9}};
        int[][] totals = {{15}, {16}, {12}, {7}, {23}, {20}};
        String[] rooms = {"living room", "Bedroom1", "Bathroom"};
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun"};

        System.out.println("**************");
        System.out.println("Makeover Report");
        System.out.println("**************");

        System.out.printf("%-10s","");
        for (String room : rooms) {
            System.out.printf(room + "\t");
        }
        System.out.println();


        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%-10s",months[i] + "\t");

            for (int j = 0; j < numbers[i].length; j++) {
                System.out.printf("%-10s",numbers[i][j] + "\t");
            }

            System.out.println();
        }
        System.out.println("**************");
        System.out.println("Monthly totals");
        System.out.println("**************");


        for (int i = 0; i < totals.length; i++) {
            int monthly = 0;
            for (int j = 0; j < totals[i].length; j++) {
                monthly += totals[i][j];
            }
            System.out.printf("%-10s%-10d", months[i], monthly);
            if (monthly >= 15) {
                System.out.printf("%-10s", "***");
            }
            System.out.println();

        }
    }
}
