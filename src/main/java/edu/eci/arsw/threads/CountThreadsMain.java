/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

/**
 *
 * @author hcadavid
 */
public class CountThreadsMain {
    
    public static void main(String a[]){
        Thread A = new CountThread(0, 99);
        Thread B = new CountThread(99, 199);
        Thread C = new CountThread(200, 299);
        A.start();
        B.start();
        C.start();
    }
    
}
