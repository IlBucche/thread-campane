/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread_campane;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author buccheri_federico
 */
public class Semafori_DINDONDAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, IOException {
        // TODO code application logic here
        DatiCondivisi d = new DatiCondivisi();
        ThVisualizza v = new ThVisualizza();
        ThSuoni DIN = new ThSuoni("DIN", d);
        ThSuoni DON = new ThSuoni("DON", d);
        ThSuoni DAN = new ThSuoni("DAN", d);

        Scanner s = new Scanner(System.in);

        String a = "";

        try {
            DIN.start();
            DON.start();
            DAN.start();

            v.start();

            a = s.nextLine();

            DIN.interrupt();
            DON.interrupt();
            DAN.interrupt();

            v.interrupt();

            DIN.join();
            DON.join();
            DAN.join();

            v.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("FATTO");

    }

}
