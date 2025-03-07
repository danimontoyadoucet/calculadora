public class Calculadora {

    // Método para sumar
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Método para restar
    public static int restar(int a, int b) {
        return a - b;
    }

    // Método para multiplicar
    public static int multiplicar(int a, int b) {
        return a * b;
    }

    // Método para dividir
    public static int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return a / b;
    }

    // Método para calcular la potencia
    public static double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    // Método principal para seleccionar la operación
    public static int calculadora(int a, int b, String opcion) {
        switch (opcion.toLowerCase()) {
            case "sumar": return sumar(a, b);
            case "restar": return restar(a, b);
            case "multiplicar": return multiplicar(a, b);
            case "dividir": return dividir(a, b);
            case "potencia": return (int) potencia(a, b);  // Llamada al método potencia
            default: throw new IllegalArgumentException("Operación no válida");
        }
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        int a = 2;
        int b = 3;

        // Prueba de la calculadora con potencia
        double resultadoPotencia = potencia(a, b); // 2 elevado a 3
        System.out.println("El resultado de " + a + " elevado a " + b + " es: " + resultadoPotencia);
    }
}
