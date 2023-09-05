/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Back;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alanm
 */
public class Almacen {
    private boolean Inuse= false;
    private  BlockingQueue<Integer> papas = new ArrayBlockingQueue<>(7);
    
    
   
    public void changeUse(){
        if(!this.Inuse){
            System.out.println("Almacen change use False-> True");
            this.Inuse = true;
        }
        else{
             System.out.println("Almacen change use True-> False");
            this.Inuse = false;
        }
        
    }
    public boolean isItInUse(){
        
        return this.Inuse;
    }
    public void addPapa() {
        try {
            this.papas.put(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(Almacen.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Papa add\n");
    }
    public void popPapa() {
        if(papas.size()!=0){
            try {
                this.papas.take();
            } catch (InterruptedException ex) {
                Logger.getLogger(Almacen.class.getName()).log(Level.SEVERE, null, ex);
            }
        System.out.println("Papa pop \n");
        }
    }
    public BlockingQueue<Integer> viewPapas(){
        System.out.println(this.papas.size());
        return this.papas;
    }
    
}
