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

/**
 *
 * @author alanm
 */
public class Procesos {

    public Almacen Almacen = new Almacen();

    public Procesos() {
        System.out.println("constructor planificador procesos");

    }

    public ArrayList<Integer> getAlmacen() {
        return Almacen.viewPapas();
    }

    public void startProcess() {

        for (int i = 0; i < 6; i++) {
            Producer producer = new Producer(Almacen, i + 1);
            Consumer consumer = new Consumer(Almacen, i + 1);
            Thread hiloProducer = new Thread(producer);
            Thread hiloConsumer = new Thread(consumer);
            hiloConsumer.start();
            hiloProducer.start();

        }

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
