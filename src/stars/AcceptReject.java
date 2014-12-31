/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stars;

/**
 *
 * @author Thejan Rajapakshe < coder [dot] clix [at] gmail [dot] com >
 */
public class AcceptReject {

    String equation;
    double xMin;
    double xMax;
    double fMax;

    public AcceptReject() {
    }

    public AcceptReject(double min, double max) {
        this.xMin = min;
        this.xMax = max;
        this.equation = "";
        fMax = this.getFMax(0.001);
    }
    public AcceptReject(double min, double max, String eq) {
        this.xMin = min;
        this.xMax = max;
        this.equation = eq;
        fMax = this.getFMax(0.001);
    }

    public void setData(double min, double max, String eq) {
        this.xMin = min;
        this.xMax = max;
        this.equation = eq;
        fMax = this.getFMax(0.001);
    }

    public double getRandomNumber() {
        UniformRandom ur = new UniformRandom();
        do {
            double r1 = ur.getRandomDouble();
            double x = xMin + (r1 * (xMax - xMin));
            double r2 = ur.getRandomDouble();
            double U = r2 * fMax;
            double Fx = this.fx(x);
            if (U < Fx) {
                return U;
            }
        } while (true);
    }

    public double[] getRandomPoint() {
        UniformRandom ur = new UniformRandom();
        double point[] = new double[2];
        do {
            double r1 = ur.getRandomDouble();
            double x = xMin + (r1 * (xMax - xMin));
            point[0] = x;
            double r2 = ur.getRandomDouble();
            double U = r2 * fMax;
            double Fx = this.fx(x);
            if (U < Fx) {
                point[1] = U;
                return point;
            }
        } while (true);
    }

    public double getFMax(double precision) {
        double counter = xMin;
        double fMax = this.fx(xMin);
        for (counter = xMin; counter < xMax; counter = counter + precision) {
            double temp_Fx = this.fx(counter);
            if (fMax < temp_Fx) {
                fMax = temp_Fx;
            }
        }
        return fMax;
    }

    public double fx() {
        return 100;
    }

    public double fx(double x) {
        double value = 10;
//        x = 100;
//        ScriptEngineManager mgr = new ScriptEngineManager();
//        ScriptEngine engine = mgr.getEngineByName("JavaScript");
//        String temp_equation = this.equation.replace("x", "" + x);
//        try {
//            value = (double) engine.eval(temp_equation);
//        } catch (ScriptException ex) {
//            Logger.getLogger(AcceptReject.class.getName()).log(Level.SEVERE, null, ex);
//            value = 0;
//        }
        return value;
    }
}
