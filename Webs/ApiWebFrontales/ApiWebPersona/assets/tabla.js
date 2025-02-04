window.onload = function () {
    listarPersonas();
}

let listarPersonas = async () => {
    const peticion = await fetch("http://localhost:8081/api/personas",
        {
            method: "GET",
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            }
        });

    const personas = await peticion.json();

    let contenidoTabla = "";

    for (let persona of personas) {
        let contenidoFila = `<tr>
        <td>${persona.id}</td>
        <td>${persona.name}</td>
        <td>${persona.surname}</td>
        <td>${persona.career}</td>
        <td>
      <i onClick="mostrarForm(${persona.id})"class="material-icons button edit">edit</i>
      <i onClick="borrarPersona(${persona.id})" class="material-icons button delete">delete</i>
     </td>
     </tr>`

        contenidoTabla += contenidoFila;
    }

    document.querySelector("#tabla tbody").outerHTML = contenidoTabla;
}

let borrarPersona = async (id) => {
    const peticion = await fetch("http://localhost:8081/api/personas/" + id,
        {
            method: "DELETE",
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            }
        });

    listarPersonas();
}

let mostrarForm = async (id) => {

    globalId = id;

    let formulario = `<h1>Modificar Personas</h1>
    <div class="formbold-main-wrapper">
        <div class="formbold-form-wrapper">
            <form method="POST">
                <div class="formbold-input-flex">
                    <div>
                        <input type="text" name="name" id="name" placeholder="name" class="formbold-form-input" />
                        <label for="name" class="formbold-form-label"> name </label>
                    </div>
                    <div>
                        <input type="text" name="surname" id="surname" placeholder="surname"
                            class="formbold-form-input" />
                        <label for="surname" class="formbold-form-label"> surname</label>
                    </div>
                </div>
                <div class="formbold-input-flex">
                    <div>
                        <input type="text" name="career" id="career" placeholder="career"
                            class="formbold-form-input" />
                        <label for="career" class="formbold-form-label"> career </label>
                    </div>
                </div>
            </div>
                <button type="button" onClick="modificarPersona(${id})" id="btnModificar" class="formbold-btn">
                    Modificar persona
                </button>
            </form>
        </div>
    </div>`;

    document.querySelector("#modificar").innerHTML = formulario;

}

let cerrarForm = async () => {
    let formulario = ``;

    document.querySelector("#modificar").innerHTML = formulario;

}

let modificarPersona = async (id) => {
    let campos = {};

    campos.id = id;
    campos.name = document.getElementById("name").value;
    campos.surname = document.getElementById("surname").value;
    campos.career = document.getElementById("career").value;

    const peticion = await fetch("http://localhost:8081/api/personas/" + id,
        {
            method: "PUT",
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(campos)
        });

    listarPersonas();
    cerrarForm();
}
