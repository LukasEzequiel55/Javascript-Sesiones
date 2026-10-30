import java.util.Scanner;

public class SwitchDemo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Opciones: 1-Transferencia, 2-Depósitos, 3-Retiro, 4-Consulta de saldo");
        System.out.print("Ingresa una opción: ");
        byte opcion = sc.nextByte();

        //Switch
        switch (opcion){
            case 1:
                System.out.println("Enviando $100.00 MXN a CUENTA *5555");
                break;
            case 2:
                System.out.println("Depositando $100.00 MXN a CUENTA *5555");
                break;
            case 3:
                System.out.println("Retirando $100.00 MXN a CUENTA *5555");
                break;
            case 4:
                System.out.println("Saldo actual: $2,000 MXN");
                break;
        }
        sc.close();
    }//main
}//class
