/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stars;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author Thejan Rajapakshe < coder [dot] clix [at] gmail [dot] com >
 */
public class Frame extends JFrame {

    public Frame() throws HeadlessException {
        InitUI();
    }

    private void InitUI() {
        setTitle("Stars");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 600);
        setLocationRelativeTo(null);
        add(new Panel());
    }

}
