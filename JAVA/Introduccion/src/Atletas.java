public class Atletas {
    public static void main(String[] args) {
        double atletaAdistmetros = 5000;
        double atletaAdistkm = atletaAdistmetros / 1000;
        double atletaAtiempomin = 30;
        double atletaAtiemposeg = atletaAtiempomin * 60;

        double atletaBdistmetros = 5000;
        double atletaBdistkm = atletaBdistmetros / 1000;
        double atletaBtiempomin = 28;
        double atletaBtiemposeg = atletaBtiempomin * 60;

        double velocidadpromA = atletaAdistmetros / atletaAtiempomin;
        double velocidadpromB = atletaBdistmetros / atletaBtiempomin;

        boolean atletaAMasRapido = velocidadpromA > velocidadpromB;
        boolean mismoRendimiento = velocidadpromA == velocidadpromB;

        System.out.println("La distancia que recorrió el atleta A fue: " + atletaBdistkm + " km");
        System.out.println("===========================================================");
        System.out.println("El tiempo del atleta B en minutos fue: " + atletaBtiempomin);
        System.out.println("La distancia que recorrió el atleta A fue: " + atletaBdistkm + " km");
        if (atletaAMasRapido) {
            System.out.println("el atleta A fue el más rápido");
            System.out.println("El tiempo del atleta A en minutos fue: " + atletaAtiempomin);
        } else if (mismoRendimiento) {
            System.out.println("Ambos atletas tuvieron el mismo rendimiento");
        } else {
            System.out.println("El atleta B es más rápido");
        }
    }//main
}//class
