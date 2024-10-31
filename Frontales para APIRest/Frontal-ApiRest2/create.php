<?php
    require 'config.php';
    
    $gradotype  = $_POST['gradotype'];
    $limitealumnos = $_POST['limitealumnos'];
    $nombregrado = $_POST['nombregrado'];

//    $gradotype  = $_GET['gradotype'];
//    $limitealumnos = $_GET['limitealumnos'];
//    $nombregrado = $_GET['nombregrado'];


    $sql = 
    "INSERT INTO grados (grado_type,limite_alumnos,nombre_grado) VALUES". 
    "('".$gradotype."',".
     "".$limitealumnos.",".
     "'".$nombregrado."')";
    $result = $mysqli->query($sql);

    $sql = "SELECT * FROM grados Order by id desc LIMIT 1"; 
    $result = $mysqli->query($sql);
    
    $data = $result->fetch_assoc();
    mysqli_close($mysqli);
    
    echo json_encode($data);
?>