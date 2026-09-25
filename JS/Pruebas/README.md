# Documentación Técnica: Pruebas Unitarias con Jest

Este proyecto contiene un conjunto de funciones matemáticas y de validación en JavaScript (`funciones.js`) junto con sus respectivas pruebas unitarias escritas en Jest (`funciones.test.js`).

---

## 1. Explicación de la Importación (`require` vs `import`)

### ¿Por qué usamos `const { ... } = require('./funciones.js');` en lugar de `import ...`?

En Node.js existen dos sistemas para importar y exportar módulos:

1. **CommonJS (`require` / `module.exports`)**: Es el sistema de módulos nativo y tradicional de Node.js. 
2. **ES Modules (`import` / `export`)**: Es el estándar moderno de JavaScript utilizado principalmente en desarrollo Web/Frontend. Para usar `import` en Jest dentro de Node.js, **se requiere configurar transpiladores como Babel o habilitar banderas experimentales en Node.**

Por simplicidad se recomendó usar **CommonJS** (`require`).

## 2. Documentación de Funciones y Pruebas Unitarias

### Ejercicio 1 — Calculadora de descuento (`calcularDescuento`)

#### Propósito en lenguaje sencillo
Esta función calcula el precio final de un producto tras aplicar un porcentaje de descuento. Además, verifica que el porcentaje ingresado sea un valor válido (entre 0 y 100).

#### ¿Qué valida esta prueba unitaria?
Valida que la lógica matemática aplique correctamente la fórmula de descuento y que la función responda con el mensaje `"Porcentaje inválido"` cuando se ingresen porcentajes fuera del rango permitido (menores a 0 o mayores a 100).

#### Tabla de casos de prueba y resultados esperados

| # | Entrada (Precio, Porcentaje) | Caso / Escenario | Resultado Esperado |
|---|---|---|---|
| 1 | `1000, 20` | Descuento válido | `800` |
| 2 | `300, 120` | Porcentaje mayor a 100 | `"Porcentaje inválido"` |
| 3 | `100, -5` | Porcentaje menor a 0 | `"Porcentaje inválido"` |
| 4 | `500, 0` | Descuento límite (0%) | `500` |
| 5 | `200, 100` | Descuento límite (100%) | `0` |

---

### Ejercicio 2 — Validación de contraseña (`validarPassword`)

#### Propósito en lenguaje sencillo
Comprueba si una cadena de texto cumple con los requisitos mínimos de seguridad: tener al menos 8 caracteres de longitud y contener por lo menos un número.

#### ¿Qué valida esta prueba unitaria?
Valida el cumplimiento de ambas reglas de seguridad. Asegura que la función devuelva `true` solo si se cumplen ambas condiciones al mismo tiempo, y `false` si falta alguna de ellas.

#### Tabla de casos de prueba y resultados esperados

| # | Entrada (Contraseña) | Caso / Escenario | Resultado Esperado |
|---|---|---|---|
| 1 | `"abc12345"` | Contraseña válida (8+ caracteres y número) | `true` |
| 2 | `"abcdefgh"` | Inválida (sin números) | `false` |
| 3 | `"a1b2c3"` | Inválida (menos de 8 caracteres) | `false` |
| 4 | `"12345678"` | Válida (solo números, 8 caracteres) | `true` |

---

## 3. Problemas Encontrados Durante el Desarrollo

Durante la implementación del proyecto me tropecé los siguientes retos técnicos:

### A. Dificultad con la sintaxis de Funciones Flecha (*Arrow Functions*)
Al migrar de la sintaxis tradicional (`function nombre() {}`) a la sintaxis moderna de funciones flecha (`const nombre = () => {}`), tuve confusiones en el retorno implícito y explícito.

* **Ejemplo del problema:**
  ```javascript
  // Retorno implícito incorrecto usando llaves {}:
  const celsiusAFahrenheit = (celsius) => { (celsius * 9/5) + 32 }; // Devuelve undefined

  // Solución 1 (Retorno explícito):
  const celsiusAFahrenheit = (celsius) => { return (celsius * 9/5) + 32; };

  // Solución 2 (Retorno implícito sin llaves):
  const celsiusAFahrenheit = (celsius) => (celsius * 9/5) + 32;