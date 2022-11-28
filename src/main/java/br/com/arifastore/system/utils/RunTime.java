package br.com.arifastore.system.utils;

public class RunTime {
    public static void ThreadDelay() {
        try {
            Thread.sleep(1L);
        } catch (InterruptedException e) {
            System.out.println("Deu ruim...");
        }
    }
}
