/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.infoThread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author frida
 */
public class CicloMain {

    public static void main(String[] args) {
        //info sul thread main
        Thread main=Thread.currentThread();
       
        System.out.println("ID: " + main.threadId());
        System.out.println("Stato: " + main.getState());
        System.out.println("Priorita: "+  main.getPriority());
        System.out.println("Attivo: " + main.isAlive());
        
        ClasseThread classeThread = new ClasseThread();
        Thread thread = new Thread(classeThread);
        thread.start();
        System.out.println("ID: " + thread.threadId());
        System.out.println("Stato: " + thread.getState());
        System.out.println("Priorita: "+ thread.getPriority());
        System.out.println("Attivo: " + thread.isAlive());
        thread.interrupt();       
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(CicloMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("ID: " + thread.threadId());
        System.out.println("Stato: " + thread.getState());
        System.out.println("Priorita: "+ thread.getPriority());
        System.out.println("Attivo: " + thread.isAlive());
    }
}
