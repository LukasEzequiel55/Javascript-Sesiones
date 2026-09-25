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

ordenes.forEach( function (orden) {
    console.log("Pedido " + orden.id + " Fecha: " + orden.fechaCreacion + " Usuario: " + orden.usuario + " Entregado:", orden.entregado, " Artículos: " + orden.articulos.join(", ") + " Total: $" + orden.total.toFixed(2));
});


//ordenes.forEach((orden) => {
//    console.log("Pedido " + orden.id + " Fecha: " + orden.fechaCreacion + " Usuario: " + orden.usuario + " Entregado:", orden.entregado, " Artículos: " + orden.articulos.join(", ") + " Total: $" + orden.total.toFixed(2));
// });
