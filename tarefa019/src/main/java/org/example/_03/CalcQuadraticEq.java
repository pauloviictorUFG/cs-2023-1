package org.example._03;

public class CalcQuadraticEq {
    public void calcQuadraticEq(double coefficientA, double coefficientB, double coefficientC) {
        double discriminant = coefficientB * coefficientB - 4 * coefficientA * coefficientC;
        if (discriminant > 0) {
            double root1, root2;
            root1 = (-coefficientB - Math.sqrt(discriminant)) / (2 * coefficientA);
            root2 = (-coefficientB + Math.sqrt(discriminant)) / (2 * coefficientA);
            System.out.println("x1 = " + root1 + ", x2 = " + root2);
        } else if (discriminant == 0) {
            double root;
            root = -coefficientB / (2 * coefficientA);
            System.out.println("x = " + root);
        } else {
            System.out.println("Equation has no roots");
        }
    }
}
