<?php
	$HOST="localhost";
	$USER="root";
	$PASSWORD="";
	$DATABASE="matricula";

	$mysqli = new mysqli($HOST, $USER,$PASSWORD , $DATABASE);
	if($mysqli === false){
		die("ERROR: Could not connect. " . mysqli_connect_error());
	}

?>