/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.infoThread;

/**
 *
 * @author frida
 */
public class ClasseThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Il Thread si e' avviato");
        while (!Thread.interrupted()) {
        // continua finchè non viene interrotto;
        }
        System.out.println("Il Thread si e' interrotto");
    }
}
