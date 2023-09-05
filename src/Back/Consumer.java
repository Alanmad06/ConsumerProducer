/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Back;

import static java.lang.Thread.sleep;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alanm
 */
public class Consumer implements Runnable{

  Random rand = new Random();
    public boolean work = false;
   public static Almacen Almacen;
    
  
    /**
     *
     */
    
    
   
    Consumer( Almacen Almacen){
        
        
        this.Almacen=Almacen;
         
    }

    Consumer() {
        
    }
   /* 
    public void inicializar(){
        
           
                Runnable runnable = new Consumer(PlanificadorProcesos.Almacen);
            consumers= new Thread(runnable);
            
            
            
        
    }
    
    public void start(){
      
        
           
           consumers.start();
      
    }
    
    
     */
     @Override
    public void run() {
        
        
         while(true){
           
        changeWork();
         
        
        Consumiendo();
        
        changeWork();
      
         }
         
         }
    
   
  
    
    
    public void Consumiendo(){
         
           
                
                
            
                     
             
              System.out.println("Inicio");
             
            
         
        int numeroAleatorio = rand.nextInt(2001)+3000;
        System.out.println(numeroAleatorio);
          
        
       
       
        try {
            sleep(numeroAleatorio);
        } catch (InterruptedException ex) {
            Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            Almacen.popPapa(); 
        
             
         
         
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
