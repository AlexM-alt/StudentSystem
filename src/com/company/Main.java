package com.company;

import java.util.Scanner;

/**
 * @author Aleksander Micyk
 * @version 1.0.0
 * Console program the basic database of student inquiries
 */

public class Main {

    public static void main(String[] args) {


        //How many new users we want to add
        System.out.println("Enter number of new students to enroll");
        Scanner scanner = new Scanner( System.in );
        int numOfStudents = scanner.nextInt();
        Student[] students = new Student[numOfStudents];

        //Create n number of new studnets
        for( int i = 0; i < numOfStudents; i++){
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition(  );
            System.out.println(students[i].toString());
        }

    }

    }
