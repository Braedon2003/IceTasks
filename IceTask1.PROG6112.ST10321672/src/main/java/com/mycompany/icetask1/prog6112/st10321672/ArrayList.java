/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.icetask1.prog6112.st10321672;
 

public class ArrayList {

    public static void main(String[] args) {

 

        int[][] marks = {{20,50,10},{80,25,15},{60,100,35},{75,40,45}};

       

        // loops twice as it is a two dimensionak array

        for (int i = 0; i< marks.length; i++) {

 

            for (int j = 0; j< marks.length-1; j++){

                System.out.print(marks[i][j] + "\t");

            }

            System.out.println();

        }




    }

}
