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
public class DatiCondivisi {
    private Semaforo s1;
    
    
    public DatiCondivisi(){
        s1 = new Semaforo(1);
    }
    
    public Semaforo getS(){
        return s1;
    }
}
