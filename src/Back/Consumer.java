/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Back;

import static java.lang.Thread.sleep;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author alanm
 */
public class Consumer implements Runnable {
    JTextArea txt= new JTextArea();
    int id;

    public static Almacen Almacen;

    /**
     *
     */
    Consumer(Almacen Almacen, int id,JTextArea txt) {
        
        this.txt=txt;
        this.Almacen = Almacen;
        this.id = id;

    }

    @Override
    public void run() {
       
while (true) {
        Consumiendo();
}
    }

    public void Consumiendo() {

        

            Almacen.workingPapasConsumer("Consumidor " + id,txt);

        

    }

}
