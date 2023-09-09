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
public class Consumer implements Runnable {

    int id;

    public static Almacen Almacen;

    /**
     *
     */
    Consumer(Almacen Almacen, int id) {

        this.Almacen = Almacen;
        this.id = id;

    }

    @Override
    public void run() {

        Consumiendo();

    }

    public void Consumiendo() {

        while (true) {

            Almacen.waitPapasConsumer("Consumidor " + id);

        }

    }

}
