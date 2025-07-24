package com.OopsPrograms;


public class TimerProgram {
    public static void main(String[] args) {
        String[] tasks = {
            "Drink Water",
            "Do Java Programs",
            "Complete your Lunch",
            "Watch Movie",
            "Practice Codes"
        };

        // Set time for each task (same size as tasks[])
        double[] times = {11.00, 12.00, 13.00, 16.00, 20.00};
        String a = "";

        for (int i = 0; i < times.length; i++) {
            if (times[i] < 12) {
                a = "am";
            } else {
                a = "pm";
            }

            System.out.println("Now the time is: " + times[i] + " " + a);
            System.out.println("So your task is: " + tasks[i]);
            System.out.println("----------------------------------");
        }
    }
}
