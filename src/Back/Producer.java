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
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.Timer;

/**
 *
 * @author alanm
 */
public class Producer implements Runnable {
JTextArea txt= new JTextArea ();
    int id;
    public Almacen Almacen;

    /**
     *
     */
    Producer(Almacen Almacen, int id,JTextArea txt) {
        this.txt=txt;
        this.Almacen = Almacen;
        this.id = id;
    }

    @Override
    public void run() {
         
while (true) {
        Producir();
}
    }

    public void Producir() {

        

            Almacen.workingPapasProducer("Productor " + id,txt);

    }

}
