export function suma(n1, n2) {
    let suma = n1 + n2;
    console.log("Opción seleccionada: " + " suma");
    console.log("Valores ingresados: " + n1 + ", " + n2);
    console.log("El resultado de sumar " + n1 + " + " + n2 + " es igual a: " + suma);
} // suma

export function resta(n1, n2) {
    let resta = n1 - n2;
    console.log("Opción seleccionada: " + " resta");
    console.log("Valores ingresados: " + n1 + ", " + n2);
    console.log("El resultado de restar " + n1 + " - " + n2 + " es igual a: " + resta);
}

export function multiplicacion(n1, n2) {
    let multiplicacion = n1 * n2;
    console.log("Opción seleccionada: " + " multiplicación");
    console.log("Valores ingresados: " + n1 + ", " + n2);
    console.log("El resultado de multiplicar " + n1 + " x " + n2 + " es igual a: " + multiplicacion);
}

export function division(n1, n2) {
    let division = n1 / n2;
    console.log("Opción seleccionada: " + " división: cociente");
    console.log("Valores ingresados: " + n1 + ", " + n2);
    console.log("El resultado de dividir " + n1 + " / " + n2 + " es igual a: " + division);
}

export function residuo(n1, n2) {
    let residuo = n1 % n2;
    console.log("Opción seleccionada: " + " división: residuo");
    console.log("Valores ingresados: " + n1 + ", " + n2);
    console.log("El residuo de dividir " + n1 + " / " + n2 + " es igual a: " + residuo);
}