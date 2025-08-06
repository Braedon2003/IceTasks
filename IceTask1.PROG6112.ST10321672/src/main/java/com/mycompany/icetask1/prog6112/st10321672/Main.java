/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.icetask1.prog6112.st10321672;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


       ArrayList <String> names = new ArrayList<String>();

        names.add("Jeff");
        names.add("Ash");
        names.add("Sma");
        names.add("Nanka");
        names.add("Anitha");
        names.add("Pain");
        names.add("Suffering");

        names.set(2,"homer");
        names.set(4,"simpson");

        names.remove("Jeff");
        names.remove("Pain");
        System.out.println(names);
    }
}




