<?php
   
$valor1 = $_POST['valor1'];
$valor2 =  $_POST['valor2'];
$tipo =  $_POST['tipo'];
 

function calcular($a,$b)
{
    
    global $valor1;
    global $valor2;
    global $tipo;
  
        switch($tipo)
        {
            case 'Somar': $resultado = $a + $b; break;
            case 'Subtrair': $resultado = $a - $b; break;
            case 'Multiplicar': $resultado = $a * $b; break;
            case 'Dividir': $resultado = $a / $b; break;
         }

return($resultado);
}

echo calcular($valor1,$valor2);
?>
