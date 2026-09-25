const funciones = require("./funciones.js");

test('1.8 + 0.4 es igual a 2.2', () => {
  expect(funciones.suma(1.8,0.4)).toBe(2.2);
}); // Sumar valores decimales

test('-5 + 3 es igual a -2', () => {
  expect(funciones.suma(-5,3)).toBe(-2);
}); // Sumar valores negativos

test('-1.8 + 0.4 es igual a -1.4', () => {
  expect(funciones.suma(-1.8,0.4)).toBe(-1.4);
}); // Sumar valores negativos decimales

// Truthiness - buscar valores null, undefined, true o false
test('El correo fernando.aguilar@idr.edu.ex tiene un formato válido', () => {
  expect(funciones.validarEmail('fernando.aguilar@idr.edu.ex')).toBeTruthy();
});

test('El correo feri23_345@outlook.com tiene un formato válido', () => {
  expect(funciones.validarEmail('feri23_345@outlook.com')).toBeTruthy();
});

test('El correo generation@mexico@.com NO tiene un formato válido', () => {
  expect(funciones.validarEmail('generation@mexico@.com')).toBeFalsy();
});

test('El correo generation.mexico@dominio NO tiene un formato válido', () => {
  expect(funciones.validarEmail('generation.mexico@dominio')).toBeFalsy();
});
