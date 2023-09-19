package calificaciones;

public class CalculadoraCalificaciones {
    private String nombre;
    private double[] calificaciones = new double[5];

    public CalculadoraCalificaciones(String nombre, double[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    public double calcularPromedio() {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }

    public char obtenerCalificacionFinal(double promedio) {
        if (promedio <= 50) {
            return 'F';
        } else if (promedio <= 60) {
            return 'E';
        } else if (promedio <= 70) {
            return 'D';
        } else if (promedio <= 80) {
            return 'C';
        } else if (promedio <= 90) {
            return 'B';
        } else {
            return 'A';
        }
    }

    public void imprimirResultados() {
        System.out.println("Nombre del estudiante: " + nombre);
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificación " + (i + 1) + ": " + calificaciones[i]);
        }
        double promedio = calcularPromedio();
        char calificacion = obtenerCalificacionFinal(promedio);
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacion);
    }

    public static void main(String[] args) {
        String nombre = "luis";
        double[] calificaciones = {65, 25, 35, 70, 10};

        CalculadoraCalificaciones calculadora = new CalculadoraCalificaciones(nombre, calificaciones);
        calculadora.imprimirResultados();
    }
}

