// Ejercicio 1 — Calculadora de descuento
function calcularDescuento(precio, porcentaje) {
  if (porcentaje < 0 || porcentaje > 100) {
    return "Porcentaje inválido";
  }
  return precio - (precio * (porcentaje / 100));
}

// Ejercicio 2 — Validación de contraseña
function validarPassword(password) {
  // Verificamos que tenga al menos 8 caracteres y al menos un número con una expresión regular (\d)
  const tieneNumero = /\d/.test(password);
  return password.length >= 8 && tieneNumero;
}

// Ejercicio 3 — Conversor de temperatura
function celsiusAFahrenheit(celsius) {
  return (celsius * 9 / 5) + 32;
}

// Ejercicio 4 — Verificador de mayoría de edad
function esMayorDeEdad(edad) {
  return edad >= 18;
}

// Ejercicio 5 — Generador de nombre completo
function generarNombreCompleto(nombre, apellido) {
  return `${nombre} ${apellido}`;
}

// Exportamos las funciones para que puedan ser utilizadas en funciones.test.js
module.exports = {
  calcularDescuento,
  validarPassword,
  celsiusAFahrenheit,
  esMayorDeEdad,
  generarNombreCompleto
};