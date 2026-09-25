const {
  calcularDescuento,
  validarPassword,
  celsiusAFahrenheit,
  esMayorDeEdad,
  generarNombreCompleto
} = require('./funciones.js');

describe('Pruebas para calcularDescuento', () => {
  test('debe calcular el descuento correctamente', () => {
    expect(calcularDescuento(1000, 20)).toBe(800);
  });

  test('debe retornar "Porcentaje inválido" si el porcentaje es mayor a 100', () => {
    expect(calcularDescuento(300, 120)).toBe("Porcentaje inválido");
  });

  test('debe retornar "Porcentaje inválido" si el porcentaje es menor a 0', () => {
    expect(calcularDescuento(100, -5)).toBe("Porcentaje inválido");
  });
});

describe('Pruebas para validarPassword', () => {
  test('debe retornar true si cumple con 8 caracteres y al menos un número', () => {
    expect(validarPassword("abc12345")).toBe(true);
  });

  test('debe retornar false si no tiene números', () => {
    expect(validarPassword("abcdefgh")).toBe(false);
  });
});

// ¡Puedes continuar agregando bloques describe/test para el resto de funciones!