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
public class nani extends Thread {
    public nani(String nome){
        super(nome);
    }
    /*public void run(){
        for(int i=0;i<7;i++){
        System.out.println("questo thread si chiama:"+ Thread.currentThread().getName()+ "il nome del nano è:"+ getName());
    }
    }*/
}
