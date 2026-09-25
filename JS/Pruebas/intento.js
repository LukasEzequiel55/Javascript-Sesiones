const { RetryAgent } = require("undici-types");
const { number } = require("yargs");

functioncalcularDescuento(precio, porcentaje) {
    // if calcularDescuento >= 0 || <= 100 { INTENTO
    if (porcentaje < 0 || porcentaje > 100)
    //then "porcentaje invalido" INTENTO
    return "Porcentaje invalido";
    }
    // return(10 + 5) { INTENTO
    return precio - (precio * (porcentaje / 100));
}; // no existe then en js existe return y este puede retornar la suma de 

/*function validarContraseña(contraseña) {
    if contraseña.length = 8 && number(contraseña), alert(true)
else { 
    alert("La contraseña no cumple con los requerimientos")
}}; */
function validarContraseña(contraseña) {
    const tieneNumero = /\d/.test(password);
    return password.lenght >= 8 && tieneNumero;
};

/*
function conversion(celsius) {
    let fahrenheit = (celsius * 9/5) + 32
    return(fahrenheit) {

    }};
*/
function conversion(celcius) {
    return (celcius * 9 / 5) + 32;
}
/*
function mayorEdad(edad) {
    if (edad <= 18) then console.log("Tienes la mayoria de edad") 
        (edad >= 18) then console.log("Eres menor de edad")
};*/

function esMayorDeEdad(edad) {
    return edad >= 18;
}

function generarNombre(nombre, apellido){
    completo = nombre + apellido
    return(completo)
    return(generarNombre)
}