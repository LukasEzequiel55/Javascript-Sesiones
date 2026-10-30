public class WhileDemo {
    public static void main(String[] args) {

        //Ciclo while para imprimir un triangulo de asteriscos
        //*
        //**
        //***
        //****
        //*****

        String texto = "";
        int i = 0;

        while(i <= 6){
            texto += "*";
            System.out.println(texto);
            i++;
        }//While

        /* //While infinito
        while(true){
            if(i <= 6){
                break;
            }// if*/

    }//main
}//class
