

package com.mycompany.bogoley_hometask5;
import java.util.concurrent.Semaphore;



public class Bogoley_HomeTask5 {
    public static void main(String[] args) {
        System.out.println("Bogoley Bogdan Evgenyevich, Variant 2, Group RIBO-01-22");
        Semaphore semaphore = new Semaphore(2);

        Student[] students = new Student[7];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student("Student" + (i + 1), semaphore);
            students[i].start();
        }

        for (Student student : students) {
            try {
                student.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
