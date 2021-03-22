<?php
    //Declara as vari�veis e captura os dados do formul�rio
$valor1 = $_POST['valor1'];
$valor2 =  $_POST['valor2'];
$tipo =  $_POST['tipo'];
 
/* Cria uma fun��o com o nome "calcular" e define como
seus par�metros as vari�veis $a e $b */
function calcular($a,$b)
{
    // Declara as vari�veis como globais
    global $valor1;
    global $valor2;
    global $tipo;
    /*  Cria uma estrutura condicional com o switch e testa qual
        o valor da vari�vel $tipo corresponde aos casos para 
        poderem ser executados corretamente */
        switch($tipo)
        {
            case 'Somar': $resultado = $a + $b; break;
            case 'Subtrair': $resultado = $a - $b; break;
            case 'Multiplicar': $resultado = $a * $b; break;
            case 'Dividir': $resultado = $a / $b; break;
         }
// Retorna o resultado do c�lculo
return($resultado);
}
//Mostra na p�gina o resultado do c�lculo
echo calcular($valor1,$valor2);
?>