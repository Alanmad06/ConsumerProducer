/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Back;

import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alanm
 */
public class Almacen {

    Random rand = new Random();
    private boolean Inuse = false;
    private final ArrayList<Integer> papas = new ArrayList<>(7);
    private String whoIsUsing;
    private ArrayList<String> whoIsSleeping = new ArrayList<>();

    public String getWhoIsUsing() {
        return whoIsUsing;
    }

    public void setWhoIsUsing(String whoIsUsing) {
        System.out.println("USANDO " + whoIsUsing);
        this.whoIsUsing = whoIsUsing;
    }

    public ArrayList<String> getWhoIsSleeping() {
        return whoIsSleeping;
    }

    public void setWhoIsSleeping(String whoIsSleeping) {
        System.out.println("Sleeping : " + whoIsSleeping);
        this.whoIsSleeping.add(whoIsSleeping);

    }

    public void clearSleepingList() {

        this.whoIsSleeping.clear();

    }

   

    public boolean isItInUse() {

        return this.Inuse;
    }

    public void addPapa(String id) {

        System.out.println(id);
        int numeroAleatorio = rand.nextInt(1001) + 2000;
        System.out.println(numeroAleatorio);

        try {

            sleep(numeroAleatorio);
            this.papas.add(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Papa add\n");

    }

    public  void popPapa(String id) {

        System.out.println(id);
        int numeroAleatorio = rand.nextInt(1001) + 2000;
        System.out.println(numeroAleatorio);

        try {
            sleep(numeroAleatorio);
            this.papas.remove(0);
        } catch (InterruptedException ex) {
            Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Papa pop \n");

    }

    public ArrayList<Integer> viewPapas() {
        System.out.println("Tamaño :"+this.papas.size());
        return this.papas;
    }

    public synchronized void workingPapasConsumer(String id) {

        setWhoIsUsing(id);
        while(papas.isEmpty()) {

            System.out.println("Wait on Papas Consumer" + id);

            try {
                setWhoIsUsing("");
                setWhoIsSleeping(id);
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Almacen.class.getName()).log(Level.SEVERE, null, ex);
            }

        } 
            setWhoIsUsing(id);
            popPapa(id);
            notifyAllPapas();
            setWhoIsUsing("");
    }

    public synchronized void workingPapasProducer(String id) {

        setWhoIsUsing(id);
        while (papas.size() == 7) {
            System.out.println("Wait on Papas Producer" + id);
            try {
                setWhoIsUsing("");
                setWhoIsSleeping(id);
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Almacen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }   setWhoIsUsing(id);
            addPapa(id);
            notifyAllPapas();
            setWhoIsUsing("");
        

    }

    public void notifyAllPapas() {

        System.out.println("Notificando...");
        notifyAll();

    }

}
