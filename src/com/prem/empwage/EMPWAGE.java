package com.prem.empwage;

/**
 * UC4 SOLVING USING SWITCH CASE STATEMENT CALCULATE WAGES FOR MONTH
 *
 * @author prem
 * @version 1.3
 * @since 08/09/2021
 */

import java.util.Scanner;

public class EMPWAGE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int is_full_time = 1;
        int is_part_time = 2;
        int is_absent = 0;

        int full_Time_hr = 16;
        int part_Time_hr = 8;
        int Wage_per_hr = 20;
        int days = 20;

        System.out.println("Enter:");
        int emp_check = sc.nextInt();
        // System.out.println(emp_check);

        switch (emp_check) {
            case 0:
                System.out.println(0);
                break;
            case 1:
                int salary = (Wage_per_hr * full_Time_hr * days);
                System.out.println(salary);
                break;
            case 2:
                salary = (Wage_per_hr * part_Time_hr * days);
                System.out.println(salary);
                break;
        }
    }
}
