package edu.unl.cc.jbeginners.math.view;
import edu.unl.cc.jbeginners.math.domine.EcuacionCuadratica;
import java.util.Scanner;

public class EcuacionExecuie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EcuacionCuadratica ecuacion = null;
        int opcion;
        do {
            System.out.println("\n===== MENÚ ECUACIÓN CUADRÁTICA =====");
            System.out.println("1. Ingresar coeficientes (a, b, c)");
            System.out.println("2. Calcular discriminante");
            System.out.println("3. Calcular y mostrar raíces");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el valor de a: ");
                    double a = sc.nextDouble();
                    System.out.print("Ingrese el valor de b: ");
                    double b = sc.nextDouble();
                    System.out.print("Ingrese el valor de c: ");
                    double c = sc.nextDouble();
                    ecuacion = new EcuacionCuadratica(a, b, c);
                    System.out.println("Ecuación ingresada: " + ecuacion.mostrarEcuacion());
                    break;

                case 2:
                    if (ecuacion != null) {
                        System.out.println("El discriminante es: " + ecuacion.calcularDiscriminante());
                    } else {
                        System.out.println("Debe ingresar primero los coeficientes (opción 1).");
                    }
                    break;

                case 3:
                    if (ecuacion != null) {
                        System.out.println("\n--- RESULTADO ---");
                        System.out.println(ecuacion.calularRaiz());
                    } else {
                        System.out.println("Debe ingresar primero los coeficientes (opción 1).");
                    }
                    break;

                case 4:
                    System.out.println("Fin del programa.");
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

        } while (opcion != 4);

        sc.close();
    }
}
