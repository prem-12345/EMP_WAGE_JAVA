package com.prem.empwage;

/**
 * UC1 CHECK EMPLOYEE IS PRESENT OR ABSENT
 *
 * @author prem
 * @version 1.1
 * @since 08/09/2021
 */

public class EMPWAGE {
    public static void main(String[] args) {
        
        //constant
        int is_full_time = 1;
        
        //computation
        double empCheck = Math.floor(Math.random() * 10) % 2;

        if (empCheck == 1) {
            System.out.println("EMPLOYEE IS PRESENT");
        } else {
            System.out.printf("EMPLOYEE IS ABSENT");
        }

    }
}
