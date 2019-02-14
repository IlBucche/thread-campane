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
public class ThSuoni extends Thread {

    private DatiCondivisi d;
    private ThVisualizza v;

    private String suono;

    ThSuoni(String suono, DatiCondivisi d) {
        this.suono = suono;
        this.d = d;
    }

    @Override
    public void run() {
        while (true) {
            d.getS().Wait();
            System.out.println(suono);
            //v.setS(suono);
            d.getS().Signal();
        }
    }
}
