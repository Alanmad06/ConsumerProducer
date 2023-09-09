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

    int id;
    public Almacen Almacen;

    /**
     *
     */
    Producer(Almacen Almacen, int id) {

        this.Almacen = Almacen;
        this.id = id;
    }

    @Override
    public void run() {

        Producir();

    }

    public void Producir() {

        while (true) {

            Almacen.waitPapasProducer("Productor " + id);

        }

    }

}
