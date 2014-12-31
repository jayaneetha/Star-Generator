/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stars;

import java.awt.Color;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Thejan Rajapakshe < coder [dot] clix [at] gmail [dot] com >
 */
public class Stars {

    public static AcceptReject ar;

    public static void main(String[] args) {
        int refreshInterval = 1000*60;
        ar = new AcceptReject(0, 1);

        Frame fm = new Frame();
        fm.setVisible(true);

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            @Override
            public void run() {
                Panel p = new Panel();
                fm.setBackground(Color.BLACK);
                fm.add(p);
            }
        }, refreshInterval, refreshInterval);
    }

}
