let boton = document.getElementById("btnRegistrar");

boton.addEventListener("click", evento => {
    evento.preventDefault();
    registrarPersona();
});

let registrarPersona = async () => {

    let campos = {};

    campos.marca = document.getElementById("marca").value.toString();
    campos.modelo = document.getElementById("modelo").value;
    campos.color = document.getElementById("color").value;
    campos.persona = document.getElementById("persona").value;

    const peticion = await fetch("http://localhost:8080/api/coches",
        {
            method: "POST",
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(campos)
        });
}