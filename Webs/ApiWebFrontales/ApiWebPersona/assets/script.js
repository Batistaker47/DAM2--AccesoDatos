let boton = document.getElementById("btnRegistrar");

boton.addEventListener("click", evento => {
    evento.preventDefault();
    registrarPersona();
});

let registrarPersona = async () => {

    let campos = {};

    campos.name = document.getElementById("name").value;
    campos.surname = document.getElementById("surname").value;
    campos.career = document.getElementById("career").value;

    const peticion = await fetch("http://localhost:8081/api/personas",
        {
            method: "POST",
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(campos)
        });
}