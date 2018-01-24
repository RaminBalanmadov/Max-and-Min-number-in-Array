package com.maxminarray;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxMinArray {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        int count;
        int maxNumber;
        int minNumber;
        
        Scanner scanner = new Scanner(System.in);
        count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
          list.add(scanner.nextInt());

        }
        maxNumber = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            
            if (list.get(i)>maxNumber) {
                maxNumber = list.get(i);
            }
        }
        minNumber = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)<minNumber) {
                minNumber = list.get(i);
            }
        }
         System.out.println("Max number in array : "+maxNumber);
         System.out.println("Min number in array : "+minNumber);

    }

}
