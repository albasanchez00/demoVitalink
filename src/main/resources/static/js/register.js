document.getElementById("form-registro").addEventListener("submit", function(e) {
  e.preventDefault();

  const formData = new FormData(this);
  const datos = {
    nombre: formData.get("nombre"),
    apellidos: formData.get("apellidos"),
    nacimiento: formData.get("nacimiento"),
    tipoDocumento: formData.get("tipoDocumento"),
    numeroIdentificacion: formData.get("numeroIdentificacion"),
    telefono: formData.get("telefono"),
    numeroTarjetaSanitaria: formData.get("numeroTarjetaSanitaria"),
    genero: formData.get("genero"),
    correoElectronico: formData.get("correoElectronico"),
    contrasenia: formData.get("contrasenia"),
    direccion: formData.get("direccion"),
    ciudadId: formData.get("ciudadId"),
    cpId: formData.get("cpId")
  };

  fetch("http://localhost:8080/api/registro", {
    method: "POST",
    headers: {
      "Content-Type": "application/json"
    },
    body: JSON.stringify(datos)
  })
  .then(res => res.text())
  .then(respuesta => {
    alert("Respuesta del servidor: " + respuesta);
  })
  .catch(error => {
    console.error("Error al registrar:", error);
    alert("Hubo un error al registrar el usuario.");
  });
});