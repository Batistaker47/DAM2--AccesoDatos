<?php
header("Access-Control-Allow-Origin: *");
header("Access-Control-Allow-Methods: GET, POST, OPTIONS");
header("Access-Control-Allow-Headers: Content-Type, Authorization");

$host = 'localhost';
$db = 'matricula';
$user = 'root';
$pass = '';

$conn = new mysqli($host, $user, $pass, $db);

if ($conn->connect_error) {
    die(json_encode(['error' => 'Connection failed: ' . $conn->connect_error]));
}

$nombreGrado = isset($_GET['nombreGrado']) ? $_GET['nombreGrado'] : '';

if (empty($nombreGrado)) {
    die(json_encode(['error' => 'nombreGrado parameter is missing or empty.']));
}

$functionName = 'CheckNombreGrado';

$sql = "SELECT $functionName(?) AS result";

$stmt = $conn->prepare($sql);
$stmt->bind_param('s', $nombreGrado);
$stmt->execute();

$result = $stmt->get_result();
$row = $result->fetch_assoc();
$exists = $row['result'] == 1;

header('Content-Type: application/json');
echo json_encode(['exists' => $exists]);

$stmt->close();
$conn->close();
?>