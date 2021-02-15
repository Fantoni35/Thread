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
public class maThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("questo thread si chiama"+ Thread.currentThread().getName());
        /*Thread y1 =new nani("brontolo");
        Thread y2= new nani("mammolo");
        Thread y3=new nani("dotto");
        Thread y4=new nani("pisolo");
        Thread y5=new nani("gongo");
        Thread y6=new nani("eolo");
        Thread y7=new nani("cucciolo");*/
        
        /*y1.start();
        y2.start();
        y3.start();
        y4.start();
        y5.start();
        y6.start();
        y7.start();*/
        
        Runnable r1= new maThread2();
        
         Thread y1 =new Thread(r1,"brontolo");
        Thread y2= new Thread(r1,"mammolo");
        Thread y3=new Thread(r1,"dotto");
        Thread y4=new Thread(r1,"pisolo");
        Thread y5=new Thread(r1,"gongo");
        Thread y6=new Thread(r1,"eolo");
        Thread y7=new Thread(r1,"cucciolo");
        
        y1.start();
        y2.start();
        y3.start();
        y4.start();
        y5.start();
        y6.start();
        y7.start();
    }
    
}
