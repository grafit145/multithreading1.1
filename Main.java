package ru.netology;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup threadGroup = new ThreadGroup("main group");
        int count = 4;
        for (int i = 0; i < count; i++) {
            new Thread(threadGroup, new MyThread(threadGroup, "Поток " + i)).start();
        }
        Thread.sleep(15000);
        threadGroup.interrupt();
    }
}