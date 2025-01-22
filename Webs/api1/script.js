let fields = {};

let boton = document.getElementById("btnRegistrar");


boton.addEventListener("click",evento => {
    evento.preventDefault();
    registrarAlumno();
});

let registrarAlumno = async()=> {
    
    fields.name = document.getElementById("name").value;
    fields.surname = document.getElementById("surname").value;
    fields.career = document.getElementById("career").value;

    const peticion = await fetch("http://localhost:8080/api/alumnos",
    {
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(fields)
    })

}

/*
let boton = document.getElementById("btnRegistrar");

boton.addEventListener("click", async evento => {
    evento.preventDefault();
    await registrarCoche(); // Llama a la función para registrar el coche
    await obtenerCoches();  // Actualiza la lista de coches después de registrar uno
});

let registrarCoche = async () => {
    let campos = {
        marca: document.getElementById("marca").value,
        modelo: document.getElementById("modelo").value,
        color: document.getElementById("color").value
    };

    try {
        const peticion = await fetch("http://localhost:8080/api/coches", {
            method: 'POST',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(campos)
        });

        if (peticion.ok) {
            alert("Coche registrado correctamente.");
            console.log("Coche registrado correctamente.");
        } else {
            alert(`Error al registrar el coche: ${peticion.statusText}`);
            console.error("Error al registrar el coche:", peticion.statusText);
        }
    } catch (error) {
        alert("Ocurrió un error al conectar con el servidor.");
        console.error("Error en la solicitud:", error);
    }
};

let obtenerCoches = async () => {
    try {
        const respuesta = await fetch("http://localhost:8080/api/coches", {
            method: 'GET',
            headers: {
                'Accept': 'application/json'
            }
        });

        if (respuesta.ok) {
            const coches = await respuesta.json();
            actualizarListaCoches(coches);
        } else {
            alert(`Error al obtener la lista de coches: ${respuesta.statusText}`);
            console.error("Error al obtener la lista de coches:", respuesta.statusText);
        }
    } catch (error) {
        alert("Ocurrió un error al conectar con el servidor.");
        console.error("Error en la solicitud:", error);
    }
};

let actualizarListaCoches = (coches) => {
    let lista = document.getElementById("listaCoches");
    lista.innerHTML = ""; // Limpia la lista actual

    coches.forEach(coche => {
        let item = document.createElement("li");
        item.textContent = `Marca: ${coche.marca}, Modelo: ${coche.modelo}, Color: ${coche.color}`;

        // Botón de eliminar
        let deleteBtn = document.createElement("button");
        deleteBtn.textContent = "Eliminar";
        deleteBtn.className = "delete-btn";
        deleteBtn.addEventListener("click", () => eliminarCoche(coche.id));

        // Botón de actualizar
        let updateBtn = document.createElement("button");
        updateBtn.textContent = "Actualizar";
        updateBtn.className = "update-btn";
        updateBtn.addEventListener("click", () => mostrarModalActualizar(coche));

        item.appendChild(deleteBtn);
        item.appendChild(updateBtn);
        lista.appendChild(item);
    });
};

let eliminarCoche = async (id) => {
    try {
        const respuesta = await fetch(`http://localhost:8080/api/coches/${id}`, {
            method: 'DELETE',
            headers: {
                'Accept': 'application/json'
            }
        });

        if (respuesta.ok) {
            alert("Coche eliminado correctamente.");
            console.log("Coche eliminado correctamente.");
            await obtenerCoches(); // Actualiza la lista después de eliminar
        } else {
            alert(`Error al eliminar el coche: ${respuesta.statusText}`);
            console.error("Error al eliminar el coche:", respuesta.statusText);
        }
    } catch (error) {
        alert("Ocurrió un error al conectar con el servidor.");
        console.error("Error en la solicitud:", error);
    }
};

let mostrarModalActualizar = (coche) => {
    // Muestra el modal
    let modal = document.getElementById("modalActualizar");
    modal.style.display = "block";

    // Rellena los campos del modal con los datos del coche
    document.getElementById("marcaModal").value = coche.marca;
    document.getElementById("modeloModal").value = coche.modelo;
    document.getElementById("colorModal").value = coche.color;

    // Agregar evento al botón de actualización en el modal
    let btnActualizarModal = document.getElementById("btnActualizarModal");
    btnActualizarModal.onclick = async (evento) => {
        evento.preventDefault();
        console.log("Actualizando coche con ID:", coche.id);
        await actualizarCoche(coche.id);
        await obtenerCoches();
        cerrarModal();
    };
};

let cerrarModal = () => {
    let modal = document.getElementById("modalActualizar");
    modal.style.display = "none"; // Cierra el modal
};

let actualizarCoche = async (id) => {
    let campos = {
        marca: document.getElementById("marcaModal").value,
        modelo: document.getElementById("modeloModal").value,
        color: document.getElementById("colorModal").value
    };

    // Validación de campos antes de realizar la actualización
    if (!campos.marca || !campos.modelo || !campos.color) {
        alert("Todos los campos son obligatorios.");
        return;
    }

    console.log("Campos para actualizar:", campos);

    try {
        const respuesta = await fetch(`http://localhost:8080/api/coches/${id}`, {
            method: 'PUT',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(campos)
        });

        if (respuesta.ok) {
            alert("Coche actualizado correctamente.");
            console.log("Coche actualizado correctamente.");
        } else {
            alert(`Error al actualizar el coche: ${respuesta.statusText}`);
            console.error("Error al actualizar el coche:", respuesta.statusText);
        }
    } catch (error) {
        alert("Ocurrió un error al conectar con el servidor.");
        console.error("Error en la solicitud:", error);
    }
};

// Cargar la lista de coches al cargar la página
document.addEventListener("DOMContentLoaded", obtenerCoches);

// Cerrar el modal cuando se haga clic en la 'x'
document.getElementById("cerrarModal").addEventListener("click", cerrarModal);


*/ 