// Función que crea la funcionalidad del formulario de contacto
export function configurarContacto() {

    // Configuración de EmailJS
    emailjs.init({
        publicKey: "yDN5F2nQ1z8xdgDF-"
    });


    // Obtenemos el formulario del HTML
    const formulario = document.getElementById("formularioContacto");

    // Obtenemos el elemento donde mostraremos
    // el mensaje de éxito o error
    const mensajeEstado = document.getElementById("mensajeEstado");


    // Detectamos cuando se envía el formulario
    formulario.addEventListener("submit", function(event) {

        // Evitamos que la página se recargue
        event.preventDefault();


        // Enviamos el formulario mediante EmailJS
        emailjs.sendForm(
            "service_8j495qm",
            "template_9f07x4w",
            formulario
        )

        // Si se envía correctamente
        .then(function() {

            mensajeEstado.innerHTML = `
                <p class="text-success">
                    ¡Mensaje enviado correctamente!
                </p>
            `;

            // Limpiamos el formulario
            formulario.reset();

        })

        // Si ocurre un error
        .catch(function(error) {

            console.log(error);

            mensajeEstado.innerHTML = `
                <p class="text-danger">
                    Ocurrió un error al enviar el mensaje.
                </p>
            `;

        });

    });

}