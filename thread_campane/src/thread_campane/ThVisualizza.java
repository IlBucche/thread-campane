/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread_campane;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author buccheri_federico
 */
public class ThVisualizza extends Thread {

    private String s;

    ThVisualizza() {
        s = "";
    }

    public void setS(String s_) {
        s = s_;
    }
/*
    @Override
    public void run() {
        while (true) {
            System.out.println(s);
        }
    }**/
}
