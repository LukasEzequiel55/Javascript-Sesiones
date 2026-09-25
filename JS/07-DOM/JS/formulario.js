const nombreIpt = document.getElementById("nombreIpt");//Input para el nombre
const formBtn = document.getElementById("formBtn");// botón del formulario
const saludo = document.getElementById("saludo");// Encabezado donde se muestra el saludo

// revisar el nombre de las id

const emailIpt = document.getElementById("emailIpt");
const edadIpt = document.getElementById("edadIpt");

formBtn.addEventListener("click", (e) => {
    e.preventDefault();
    nombre = nombreIpt.value;
    email = emailIpt.value;
    edad = edadIpt.value;

nombreValido = /^[a-zA-Z]+$/.test(nombre) && nombre.length >= 3;
emailValido = /^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(email);
edadValida = /^\d+$/.test(edad) && Number(edad) > 0;

if (!nombreValido) {
        //saludo.innerText = "El nombre debe tener al menos 3 letras y solo contener letras.";
        alert("El nombre debe tener al menos 3 letras y solo contener letras.");
        return;
    }

    if (!emailValido) {
        saludo.innerText = "El email no tiene un formato válido.";
        return;
    }

    if (!edadValida) {
        saludo.innerText = "La edad debe ser un número positivo.";
        return;
    }
    saludo.innerText = `¡Hola, ${nombre}! Tu email es ${email} y tienes ${edad} años.`;
    //alert(`¡Hola, ${nombre}! Tu email es ${email} y tienes ${edad} años.`);
});