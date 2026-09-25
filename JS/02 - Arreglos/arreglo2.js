 // agregar elementos
 //push -> agrega un elemento al final del arreglo
colores.push("café");
console.log(colores);
//unshift -> agrega un elemento al inicio del arreglo
colores.unshift("morado");
console.log(colores);
// Eliminar elementos
//pop -> elimina el último elemento del arreglo
colores.pop();
console.log(colores);
//shift -> elimina el primer elemento del arreglo
colores.shift();// se elimina morado
colores.shift();// elimina rojo
console.log(colores);
console.log(colores);


// Métodos iterativos
// forEach -> Ejecuta una operación sobre todos los elementos del array
// Sintaxis similar a una función común
colores.forEach(function (color){
    console.log(color.toUpperCase());
});
// Sintaxis similar a una función flecha
personas.forEach((persona) => console.log(persona.toUpperCase()));

// map -> hace lo mismo que forEach, pero devuelve un arreglo nuevo.
const numerosImpares = numerosPares.map((numero) => numero + 1);
console.log(numerosImpares);

//filter -> Evalúa cada elemento con una condición, y guarda 
//cada elemento que cumpla con esa condición en un arreglo nuevo
const filtro = personas.filter((persona) => persona === "Ana");// anónima
console.log("Total de veces que se repite Ana: " + filtro.length);

// function nombre(parámetros){ código }
function sumar(a, b){
  console.log(a + b);
}
// sumar

// const nombre = (parámetros) => código
const sumar = (a, b) => console.log(a + b);

// function (parámetro){ código }
//function(x){
//  console.log(x + "!");
//}

// (parámetro) => código
const sumar = (b, a )=> console.log(a + b);
