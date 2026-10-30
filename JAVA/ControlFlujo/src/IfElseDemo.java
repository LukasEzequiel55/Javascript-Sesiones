import java.util.Scanner;

public class IfElseDemo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Scanner construido (Input)

        System.out.print("Ingresa el primer valor a operar: ");
        double n1 = sc.nextDouble();

        System.out.print("Ingresa el segundo valor a operar: ");
        double n2 = sc.nextDouble();

        //Operador ternario
        String esMayor = n1 > n2 ? "n1 es mayor que n2" : "n2 es mayor que n1";


        System.out.print(" Primer valor: " + n1 + " Segundo valor: " + n2);

        if(n2 != 0) {
            double cociente = n1 / n2;
            String cocienteRedondeado = String.format("%.2f", cociente);
            System.out.println(" Cociente: " + cocienteRedondeado);
        }//if
        if(n2 == 0){
            System.out.println("ERROR: No es posible dividir entre 0");
        }//if

        System.out.print(esMayor);
        /*
*
if(n2 == 0){
    System.out.println("ERROR: No es posible dividir entre 0");
} else {
    double cociente = n1/n2;
    String cocienteRedondeado = String.format("%.4f", cociente);
    System.out.println("Cociente: " + cocienteRedondeado);
}// else*/


    }//main
}//class
