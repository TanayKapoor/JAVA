package com.personalnotes;

class NewThread implements Runnable {
    String name;
    Thread t;

    NewThread (String threadname) {
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
    }

    public void run(){
        try {
            for (int n = 5; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
        System.out.println(name + "EXITING");
    }

}

public class MultiThread {
    public static void main(String[] args) {
        NewThread nt1 = new NewThread("One");
        NewThread nt2 = new NewThread("Two");
        NewThread nt3 = new NewThread("Three");

//        Staring the threads
        nt1.t.start();
        nt2.t.start();
        nt3.t.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread exiting");
    }
}
