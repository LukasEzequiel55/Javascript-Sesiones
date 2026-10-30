public class VariablesDatos {

    //Ejecuta mi aplicación - por eso es main
    public static void main(String[] args){
        // System.out.println("VariablesDatos funciona!");
        //Declaración de una variable - tipo nombre = valor;
        // Números enteros
        byte edad = 25; //byte - enteros pequeños
        short sueldo = 10000; // short - enteros entre 4 y 5 digitos
        int idUsuario = 123456789; // int - enteros hasta mil millones aprox (tipo por defecto que usa JAVA)
        long LightYear = 1400000L; // Long - enteros demasiado grandes, se suele convertir por defecto a int

// Números decimales (punto flotante)
        float estatura = 1.76F; // float - decimales no tan precisos
        double fuerza = 52.33; // double - decimales con precision y es el dato por defecto que usa JAVA para numeros decimales
// Caracteres
        char calificacion = 'A' ; // char - permite guardar un caracter
        char calificacion2 = '\u0000' ;// Caracter en formato UTF-8
    }//main
}// class VariablesDatos
