/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Back;

import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author alanm
 */
    public class Procesos {
    JTextArea txt = new JTextArea();
    public Almacen Almacen = new Almacen();
    
    

    public Procesos(JTextArea txt) {
        this.txt=txt;
        System.out.println("constructor planificador procesos");
    }

    public ArrayList<Integer> getAlmacen() {
        return Almacen.viewPapas();
    }

    public void startProcess(int numProducers , int numConsumers) {
    
        
        Thread hilo = new Thread(){
    public void run(){
       
        for (int i = 0; i < numProducers; i++) {
            Producer producer = new Producer(Almacen, i + 1,txt);
            
            Thread hiloProducer = new Thread(producer);
           
          
            hiloProducer.start();

        } 
         for (int i = 0; i < numConsumers; i++) {
            
            Consumer consumer = new Consumer(Almacen, i + 1,txt);
         
            Thread hiloConsumer = new Thread(consumer);
            hiloConsumer.start();
       

        }
        
    }
    
}; 
       
    
    hilo.start();
       

    }
    
   
    
    

    public String getUsingAlmacen() {
        return Almacen.getWhoIsUsing();
    }

    public ArrayList<String> getSleep() {
        return Almacen.getWhoIsSleeping();
    }

    public void clearSleepingList() {
        Almacen.clearSleepingList();
    }

}
