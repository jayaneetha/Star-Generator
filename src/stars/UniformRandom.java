/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stars;

import java.awt.Color;
import java.util.Random;

/**
 *
 * @author Thejan Rajapakshe < coder [dot] clix [at] gmail [dot] com >
 */
public class UniformRandom {

    public boolean getRandomBool() {
        boolean rnd = false;
        double r = new Random().nextDouble() - 0.5;
        if (r > 0) {
            rnd = true;
        }
        return rnd;
    }
    
    public boolean getRandomBool(double TruePercentage){
       boolean rnd = false;
        double r = new Random().nextDouble() - (TruePercentage/100);
        if (r < 0) {
            rnd = true;
        }
        return rnd;
    }
    
    public double getRandomDouble(){
        double rnd = new Random().nextDouble();
        return rnd;
    }
    
    public int getRandomInt(){
        int rnd = new Random().nextInt();
        return rnd;
    }
    
    public int getRandomInt(int bound){
        int rnd = new Random().nextInt(bound);
        return rnd;
    }
    
    public Color getRandomColor(){
        int r = this.getRandomInt(255);
        int g = this.getRandomInt(255);
        int b = this.getRandomInt(255);
        Color c = new Color(r, g, b);
        return c;
    }
}
