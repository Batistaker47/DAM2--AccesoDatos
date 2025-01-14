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
