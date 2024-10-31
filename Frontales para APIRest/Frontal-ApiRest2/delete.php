<?php
    require 'config.php';

    $id  = $_POST["id"];

    $sql = "DELETE FROM grados WHERE id = '".$id."'";
    $result = $mysqli->query($sql);
    mysqli_close($mysqli);
    
    echo json_encode([$id]);
?>