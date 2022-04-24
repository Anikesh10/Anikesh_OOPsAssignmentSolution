package com.greatlearning.main;


import com.greatlearning.dept.AdminDepartment;
import com.greatlearning.dept.HrDepartment;
import com.greatlearning.dept.TechDepartment;

public class Main {

    public static void main(String args[]) {
        AdminDepartment admin = new AdminDepartment();
        HrDepartment hrdept = new HrDepartment();
        TechDepartment techdpt = new TechDepartment();

// Admin Department
        System.out.println(admin.departmentName());
        System.out.println(admin.getTodayswork());
        System.out.println(admin.getworkDeadLine());
        System.out.println(admin.isTodayHoliday());
        System.out.println("");
        System.out.println("");

// HR Department
        System.out.println(hrdept.departmentName());
        System.out.println(hrdept.doActivity());
        System.out.println(hrdept.getTodayswork());
        System.out.println(hrdept.getworkDeadline());
        System.out.println(hrdept.isTodayHoliday());
        System.out.println("");
        System.out.println("");

// TechDepartment

        System.out.println(techdpt.departmnentName());
        System.out.println(techdpt.getTodayswork());
        System.out.println(techdpt.WorkDeadLine());
        System.out.println(techdpt.getTechStackinformation());
        System.out.println(techdpt.isTodayHoliday());

    }

}
