/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread_campane;

/**
 *
 * @author buccheri_federico
 */
public class Semaforo {

    int count;

    public Semaforo(int a) {
        count = a;
    }

    synchronized public void Wait() {
        while (count == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        count--;
    }

    synchronized public void Signal() {
        count++;
        notify();
    }

    synchronized public void P() {
        while (count == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        count--;
    }

    synchronized public void V() {
        count++;
        notify();
    }
}
