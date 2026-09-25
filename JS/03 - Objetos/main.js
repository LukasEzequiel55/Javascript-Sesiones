// Objetos

//Estructura de datos que guarda valores en pares key:values
//Representa un objeto del mundo real.
// Puede tener tantas propiedas como métodos necesitemos.

const  estudiante = {
    id: 344,
    nombre: "Jane Doe",
    inscrito: true,
    cursos: ["Matemáticas I", "Comunicación y Trabajo", "Redes"],
    utiles: {nombre: "sacapuntas", color: "rojo"}
};



//Muestra el objeto completo
console.log(estudiante);

//objeto.propiedad -> Muestra/accede a la propiedad indicada
console.log(estudiante.nombre);
console.log(estudiante.cursos[0]);
console.log(estudiante.utiles.color);

console.log ( estudiante.id, estudiante.nombre);

estudiante.cursos.forEach(function (curso){
    console.log(curso);
});

estudiante.cursos.forEach((curso) => console.log(curso));

console.log(estudiante.id, estudiante.nombre);


const ordenes = [
{
    id: 112,
    fechaCreacion: "2026-05-16",
    usuario: 343,
    entregado: false,
    articulos: ["cable USB", "cargador 5V", "adaptador USB"],
    total: 551.39,
    imprimirEstatus() {
        console.log("Pedido " + this.id + " entregado:", this.entregado);
    }
},
{
    id: 125,
    fechaCreacion: "2026-08-02",
    usuario: 55432,
    entregado: true,
    articulos: ["corbata", "perfume 100 ml"],
    total: 782.99,
    imprimirEstatus() {
        console.log("Pedido " + this.id + " entregado:", this.entregado);
    }
},
{
    id: 341,
    fechaCreacion: "2026-11-23",
    usuario: 445,
    entregado: true,
    articulos: ["guitarra eléctrica", "amplificador", "cables"],
    total: 10564.77,
    imprimirEstatus() {
        console.log("Pedido " + this.id + " entregado:", this.entregado);
    }
}];

forEach(ordenes, (orden) => {
    console.log("Pedido " + orden.id + "Fecha: " + orden.fechaCreacion + "Usuario: " + orden.usuario + " Entregado:", orden.entregado);
});
