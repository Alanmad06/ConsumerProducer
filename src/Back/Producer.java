/*
   
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Back;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Thread.sleep;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;

/**
 *
 * @author alanm
 */
public class Producer implements Runnable {
    Random rand = new Random();
    public boolean work = false;
    int id;
    public Almacen Almacen;
    
    
    
    /**
     *
     */
    
    
    Producer( Almacen Almacen,int id){
       
        this.Almacen=Almacen;
         this.id = id;
    }

    Producer(){
        
    }
    
   /* public void inicializar(){
       
           
                
            producers= new Thread(runnable);
           
            
            
        
    }
    
    public void start(){
      
        
        
        producers.start();
       
    }
    
     */
     @Override
    public void run() {
        
        
        
         
        
        Producir();
        
        
        
        
            
         
         }
    
   
   

    
    
    
    public void Producir(){

           
             
                
     while(true){
          
     changeWork();
     
    
              
                     
             
     
            
           
       
     Almacen.waitPapasProducer("Productor "+id);
         
 changeWork();           
}
       
         
         
    }
    
    public void waitProcess(){
         synchronized(Almacen){
             try {
                 Almacen.wait();
                 System.out.println("Waiting...");
             } catch (InterruptedException ex) {
                 Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
    }
    
    public void wakingUp(){
        synchronized(Almacen){
            System.out.println("Waking Up");
            Almacen.notifyAll();
         }
    }
    
    public boolean isWorking(){
        return this.work;
    }
    
    public void changeWork(){
        if(!this.work){
            this.work= true;
        }else{
            this.work=false;
        }
    }

   

  
    
    

    
    
}
