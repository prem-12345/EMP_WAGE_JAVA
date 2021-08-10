package com.prem.empwage;

/**
 * UC5 CALCULATE WAGES TILL A CONDITION OF TOTAL WORKING HRS OR DAYS IS REACHED FOR MONTH
 *
 * @author prem
 * @version 1.5
 * @since 09/08/2021
 */

import java.util.Scanner;

public class EMPWAGE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //constants
        int is_full_time = 1;
        int is_part_time = 2;
        int is_absent = 0;
        int full_Time_hr = 16;
        int part_Time_hr = 8;
        int Wage_per_hr = 20;

        //variables
        int emp_hr = 0;
        int day = 0;
        int salary = 0;
        
        //taking user inputs
        System.out.println("ENTER THE HOUR");
        int a = sc.nextInt();
        System.out.println("ENTER THE DAYS");
        int b = sc.nextInt();

        //computation
        while (emp_hr <= a && day <= b) {

            int empCheck = (int) (Math.random() * 10) % 3;

            switch (empCheck) {
                case 0:
                    // System.out.println("Absent");
                    day++;
                    break;
                case 1:
                    //  System.out.println("Present full day");
                    salary = (salary + (full_Time_hr * Wage_per_hr));
                    emp_hr = (emp_hr + full_Time_hr);
                    day++;
                    break;
                case 2:
                    // System.out.println("Present partTime");
                    salary = (salary + (part_Time_hr * Wage_per_hr));
                    emp_hr = (emp_hr + part_Time_hr);
                    day++;
                    break;
            }
        }
                    System.out.println(salary);
                    System.out.println(emp_hr);
                    System.out.println(day);
    }
}
