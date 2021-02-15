/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

/**
 *
 * @author PC
 */
public class maThread2 implements Runnable {
    
    public void run(){
        for(int i=0;i<7;i++){
        System.out.println("questo thread si chiama:"+ Thread.currentThread().getName());
    }
    }
    
}
