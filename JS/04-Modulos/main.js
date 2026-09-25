import { suma, resta, multiplicacion, division, residuo } from "./operaciones.js"

let opcion = 2;

function calculadora(opcion) {
    let n1 = 5;
    let n2 = 6;

    switch (opcion) {
        case 1:// {
            suma(n1 + n2);
            break; // }
        case 2:
            resta(n1 - n2);
            break;
        case 3:
            multiplicacion(n1 * n2);
            break;
        case 4:
            division(n1 / n2);
            break;
        case 5:
            residuo(n1 % n2);
            break;
        default:
            console.log("La opción " + opcion + " no es válida.");
    }// switch
}// calculadora

calculadora(opcion);