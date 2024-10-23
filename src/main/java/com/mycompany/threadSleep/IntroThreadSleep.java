/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.threadSleep;

/**
 *
 * @author frida
 */
public class IntroThreadSleep {

    public static void main(String[] args) throws InterruptedException {
        Contatore contatore = new Contatore();
        Thread contatoreThread = new Thread(contatore);
        contatoreThread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Il Main conta: " + i);
            if (i >= 5) {
                contatoreThread.join();
            }
        }
    }
}
