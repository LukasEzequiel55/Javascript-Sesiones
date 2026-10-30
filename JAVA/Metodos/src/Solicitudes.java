public class Solicitudes {
    public static void main(String[] args) {
        String[] solicitudes = {"pendiente", "aprobada", "rechazada", "pendiente", "aprobada", "rechazada",
                "pendiente", "aprobada", "rechazada",
                "pendiente", "aprobada", "rechazada", "rechazada",
                "pendiente", "pendiente", "aprobada", "rechazada", "rechazada",
                "pendiente", "pendiente", "aprobada", "rechazada",
                "pendiente", "aprobada", "rechazada",
        };
        contarSolicitudes(solicitudes);
    }//main

    static void contarSolicitudes(String[] solicitudes){
        int pendientes = 0;
        int aprobadas = 0;
        int rechazadas = 0;

        for (int i = 0; i < solicitudes.length; i++){

            switch (solicitudes[i]) {
                case "pendiente":
                pendientes++;
                break;
                case  "aprobada":
                    aprobadas++;
                    break;
                case "rechazada":
                    rechazadas++;
                    break;
            }// switch
        }//for
        System.out.println("Solicitudes pendientes" + pendientes);
        System.out.println("Solicitudes aprobadas" + aprobadas);
        System.out.println("Solicitudes rechazadas" + rechazadas);
        System.out.println("Solicitudes totales" + solicitudes.length);


        }//contar solicitudes
}//class
