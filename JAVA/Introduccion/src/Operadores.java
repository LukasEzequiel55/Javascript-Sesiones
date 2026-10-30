public class Operadores {
    public static void main(String[] args) {
        int n1 = 54;
        int n2 = 105;
        boolean verdadero = true;
        boolean falso = false;

        int suma = n1 + n2; // operacion aritmetica suma
        int resta = n1 - n2; // operacion aritmetica resta
        int multiplicacion = n1 * n2; // operacion aritmetica multiplicación
        float division = (float) n1 / n2; // operacion aritmetica division

        System.out.println("El resultado de la suma es;  " + suma);
        System.out.println("El resultado de la resta es;  " + resta);
        System.out.println("El resultado de la multiplicacion es;  " + multiplicacion);
        System.out.println("El resultado de la division es;  " + division);

        // Tabla de verdad operador AND - devuelve true cuando TODAS las condiciones se cumplen
        System.out.println(verdadero && verdadero); //true
        System.out.println(verdadero && falso); //false
        System.out.println(falso && verdadero); //false
        System.out.println(falso && falso); // false

        // Tabla de verdad operador OR - devuelve true cuando UNA las condiciones se cumplen
        System.out.println(verdadero || verdadero); //true
        System.out.println(verdadero || falso); //true
        System.out.println(falso || verdadero); //true
        System.out.println(falso || falso); // false

        // Tabla de verdad operador NOT
        System.out.println(!verdadero); //false
        System.out.println(!falso); // true

    }// main
}// class operadores
