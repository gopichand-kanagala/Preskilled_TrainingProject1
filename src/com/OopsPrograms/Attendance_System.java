package com.OopsPrograms;


import java.util.ArrayList;
import java.util.Scanner;

public class Attendance_System {

    // Lists to store student names and their attendance status
    ArrayList<String> names = new ArrayList<>();
    ArrayList<String> statuses = new ArrayList<>();

    // Method to mark attendance
    public void mark(String studentName, String status) {
        names.add(studentName);
        statuses.add(status);
    }

    // Method to display the attendance record
    public void showAttendance() {
        System.out.println("\nAttendance Record:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i) + " - " + statuses.get(i));
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Attendance_System app = new Attendance_System();

        while (true) {
            System.out.print("Enter student name (or 'done' to finish): ");
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("done")) {
                break;
            }

            System.out.print("Enter status (Present/Absent): ");
            String status = scanner.nextLine();

            app.mark(name, status);
        }

        app.showAttendance();
    }
}