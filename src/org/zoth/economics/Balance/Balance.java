package org.zoth.economics.Balance;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Zoth
 * @since 23.10.13
 */
public class Balance {

    public static double E(double Y, double A, double Cy) {
        return A + Cy * Y;
    }

    public static double balance(double Y1, double A, double Cy) {
        if (Cy >= 1 || Cy <= 0) {
            throw new IllegalArgumentException();
        }
        double e = E(Y1, A, Cy);
        if (e != Y1) {
            Y1 = e;
            System.out.println("New Y1: " + Y1);
            balance(Y1, A, Cy);
        }
        return Y1;
    }
}
