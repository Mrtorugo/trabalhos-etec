
<!doctype html>
<html>

<head>
<meta charset="utf-8">
<title>Calculadora IMC</title>
<link href="enc/estilo.css" rel="stylesheet" type="text/css">
</head>

<body>

<div id="content">

   

        <div id="resultado">
        <?php 
		$peso = $_GET['peso'];
		$altura = $_GET['altura'];
		
		$conta1 = $altura*$altura;
		$conta2 = $peso/$conta1;
		
		$resultado = number_format($conta2);
		
		if(isset($resultado) && $resultado != '0'){;	
			echo '<h1>Seu IMC é:</h1>';
			echo '<h2>'.$resultado.'</h2>';
		}else{
			echo '<h1>Por favor, utilize apenas numeros!</h1>';	
		}
		?>
			
        	
          
           
        </div>
       
        
</div>

    
</body>
</html>