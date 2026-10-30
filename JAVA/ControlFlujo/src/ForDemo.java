public class ForDemo {
    static void main(String[] args) {

        String[] personas = {"Fer", "Ana", "Luisa"};
        // personas[3] = "José";

        //incio; condicion; contador
        for(int i = 0; i < personas.length; i++){
            System.out.println(personas[i].toUpperCase());
        }//ciclo for

        for(int i = 5; i>=0; i--){
            System.out.println(i);
        }//ciclo for

        for(String persona:personas){
            System.out.println(persona);
        }//ciclo forEach
    }//main
}//class
