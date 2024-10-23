/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.threadSleep;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author frida
 */
public class Contatore implements Runnable {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Il Thread conta: " + i);
                TimeUnit.SECONDS.sleep(1);
            }
        } catch (InterruptedException e) {
            System.out.println("il Thread si è interrotto in modo errato");
        }
    }
}
