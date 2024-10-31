<?php
    $servername = "localhost";
    $username = "root";
    $password = "";
    $dbname = "matricula";
    
    $mysqli = new mysqli($servername, $username, $password, $dbname);
    if ($mysqli->connect_error) {
        die("Connection failed: " . $mysqli->connect_error);
    }


    $grado_type  = $_POST['grado_type'];
    $limite_alumnos = $_POST['limite_alumnos'];
    $nombre_grado = $_POST['nombre_grado'];

//    $gradotype  = $_GET['gradotype'];
//    $limitealumnos = $_GET['limitealumnos'];
//    $nombregrado = $_GET['nombregrado'];

//  sql del insert
    $sql = "INSERT INTO grados(id, grado_type, limite_alumnos, nombre_grado) 
    VALUES ('','$grado_type','$limite_alumnos','$nombre_grado')";
    $result = $mysqli->query($sql);

//  sql del select
    $sql = "SELECT * FROM grados Order by id desc LIMIT 1";
    $result = $mysqli->query($sql);


    $data = $result->fetch_assoc();
    echo json_encode($data);
    
    
    mysqli_close($mysqli);
?>