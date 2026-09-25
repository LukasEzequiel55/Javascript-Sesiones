//MANIPULACIÓN DEL DOM - Guia básica

//document - Objeto que represantala página HTML
console.log(document);

//acceder a un elemento
const encabezado = document.getElementById("encabezado");
const parrafo = document.getElementsByClassName("text-center");
const button = document.querySelector("button");

console.log(parrafo)

//cambiar el texto de un elemento - innerText
encabezado.innerText = "Programación con JavaScript";
parrafo.innerText = "Cambio de palabras";

//Agregar elementos a mi página HTML - innerHTML
parrafo.innerHTML = "<span style='text-decoration:underline'></span>";

encabezado.style.color = "blue";

console.log(button.className);
// element.classname: Modifica el nombre de una clase, y usualmente se usa para modificar estilos tambien
button.className = "btn btn-sucess";

//Evento -acción del ususario dentro de la aplicación

//addEventListener ("evento")

button.addEventListener("click", () => {
    alert("Respondiendo al evento click")
});