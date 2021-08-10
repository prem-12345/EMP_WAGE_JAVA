package com.prem.empwage;

/**
 * UC3 ADD PART TIME EMPLOYEE AND WAGE
 *
 * @author prem
 * @version 1.3
 * @since 09/08/2021
 */

public class EMPWAGE {
    public static void main(String[] args) {
        
        //constants
        int is_full_time = 1;
        int is_part_time=2;
        int is_absent = 0;
        int emp_hr = 16;
        int Wage_per_hr = 20;
        
        //computation
        double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck == 1) {
            System.out.println("EMPLOYEE IS FULL_TIME");
            System.out.println("Emp hour");System.out.println(emp_hr=16);
        }else if(empCheck==2){
            System.out.println("EMPLOYEE IS PART_TIME");
            System.out.println("Emp hour");System.out.println(emp_hr=8);

        }
        else{
            System.out.println("EMPLOYEE IS ABSENT");
            System.out.println("Emp hour");System.out.println(emp_hr = 0);
        }

        int dailywage = (emp_hr * Wage_per_hr);
        //printing the Emp Daily Wage
        System.out.println("Emp Daily Wage");
        System.out.println(dailywage);
    }
}
