/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bogoley_hometask5;

import java.util.concurrent.Semaphore;

/**
 *
 * @author beb19
 */
class Student extends Thread {
    private String name;
    private Semaphore semaphore;

    public Student(String name, Semaphore semaphore) {
        this.name = name;
        this.semaphore = semaphore;
    }

    public void run() {
        try {
            System.out.println(name + " waiting");
            semaphore.acquire();
            System.out.println(name + " eating");
            Thread.sleep(3000);
            semaphore.release();
            System.out.println(name + " exit");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}