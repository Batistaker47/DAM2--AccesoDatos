<?php
  require 'config.php';

  $id  = $_POST["id"];
  $gradotype = $_POST['gradotype']; 
  $limitealumnos = $_POST['limitealumnos'];
  $nombregrado = $_POST['nombregrado'];
  
 // $id  = $_GET["id"];
 // $gradotype = $_GET['gradotype']; 
 // $limitealumnos = $_GET['limitealumnos'];
 // $nombregrado = $_GET['nombregrado'];

  $sql = "UPDATE grados SET ". 
         "grado_type = '".$gradotype."',".
         "limite_alumnos = ".$limitealumnos.",".
         "nombre_grado = '".$nombregrado."'".
         " WHERE id = '".$id."'";
  //echo $sql;
  $result = $mysqli->query($sql);
  
  $sql = "SELECT * FROM grados WHERE id = '".$id."'"; 
  $result = $mysqli->query($sql);
  $data = $result->fetch_assoc();
  
  echo json_encode($data);
?>