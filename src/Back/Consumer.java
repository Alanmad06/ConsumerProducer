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
    int id;
    public boolean work = false;
   public static Almacen Almacen;
    
  
    /**
     *
     */
    
    
   
    Consumer( Almacen Almacen , int id){
        
        
        this.Almacen=Almacen;
        this.id = id;
         
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
   
         
           
      
        
        Consumiendo();
        
       
      
         
         
         
    }
   
  
    
    
    public void Consumiendo(){
         
       while(true){  
           
        changeWork();        
       
          
            
                     
             
           
            
        
        
        
        Almacen.waitPapasConsumer("Consumidor "+id);     
        
       changeWork();   
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
