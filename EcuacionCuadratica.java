package edu.unl.cc.jbeginners.math.domine;
import java.math.*;

public class EcuacionCuadratica {
    private double A;
    private double B;
    private double C;

    public EcuacionCuadratica(double A, double B, double C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    //Calcular el discriminate
    public double calcularDiscriminante() {
        return (B * B) - (4 * A * C);
    }

    //Validar que A sea diferente de 0
    public boolean diferentede0() {
        return A != 0;
    }

    //Calcular las raíces
    public String calularRaiz() {
        if (!diferentede0()) {
            return "El coeficiente de A no puede ser 0, por lo tanto no es una ecuación cuadrática.";
        }
        double D = calcularDiscriminante();
        String resultado = "";

        if (D > 0) {
            double x1 = (-B + Math.sqrt(D)) / (2 * A);
            double x2 = (-B - Math.sqrt(D)) / (2 * A);
            resultado = "Raíces reales distintas:\nX1 = " + x1 + "\nX2 = " + x2;
        } else if (D == 0) {
            double x = -B / (2 * A);
            resultado = "Raíz doble:\nX = " + x;
        } else {
            double parteReal = -B / (2 * A);
            double parteImaginaria = Math.sqrt(-D) / (2 * A);
            resultado = "Raíces complejas:\nX1 = " + parteReal + " + " + parteImaginaria + "i"
                    + "\nX2 = " + parteReal + " - " + parteImaginaria + "i";
        }

        return resultado;
    }
    public String mostrarEcuacion() {
        return A + "x² + " + B + "x + " + C + " = 0";
    }
}

