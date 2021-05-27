package com.personalnotes;

class NewThread1 extends Thread {
    NewThread1() {
        super("Demo Thread");
        System.out.println("Child thread: " + this);
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted");
        }
        System.out.println("Exiting thread");
    }
}

public class ExtendedClass {
    public static void main(String[] args) {
        NewThread1 nt = new NewThread1();

        nt.start();

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main thread: " + i);
                Thread.sleep(1000);
            }
            ;
        } catch (InterruptedException e) {
            System.out.println("Main interrupted");
        }
        System.out.println("Main thread exiting");
    }
}

