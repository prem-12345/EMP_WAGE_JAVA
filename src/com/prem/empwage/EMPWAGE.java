package com.prem.empwage;

/**
 * UC2 CALCULATE DAILY EMPLOYEE WAGE
 *
 * @author prem
 * @version 1.1
 * @since 08/09/2021
 */

public class EMPWAGE {
    public static void main(String[] args) {
        int is_full_time = 1;
        int is_absent = 0;

        int emp_hr = 8;
        int Wage_per_hr = 20;

        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == 1) {
            System.out.println("EMPLOYEE IS FULL_TIME");
            System.out.println("Emp hour");
            System.out.println(emp_hr = 8);
        } else {
            System.out.println("EMPLOYEE IS ABSENT");
            System.out.println("Emp hour");
            System.out.println(emp_hr = 0);
        }

        int dailywage = (emp_hr * Wage_per_hr);
        System.out.println("Emp Daily Wage");
        System.out.println(dailywage);

    }
}
