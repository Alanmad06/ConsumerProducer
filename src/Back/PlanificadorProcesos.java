/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Back;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alanm
 */
public class PlanificadorProcesos {
    
  
   
    public Almacen Almacen = new Almacen();
   
    
    public PlanificadorProcesos(){
        System.out.println("constructor planificador procesos");
      
            
   }
  
   
   public void startProcess() {
      
      
       new Thread(new Producer(Almacen)).start();
       new Thread(new Consumer(Almacen)).start();
       
     
       
       
  
   }

   
    
    
}
