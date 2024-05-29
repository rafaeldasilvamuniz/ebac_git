<script setup>
//botão limpar
  function Limpar(id1, id2){
		document.getElementById(id1).value = "";
		document.getElementById(id2).value = "";
	}	

  function Calcular(id1, id2){
		//captura o valor do select(dropdown) selecionado
		var operador = document.getElementById("operadores").options[document.getElementById("operadores").selectedIndex].value;
		
		var num1 = document.getElementById(id1).value;
		var num2 = document.getElementById(id2).value;
		var resultado = new Number();
		//objeto com as funçoes dos algoritimos que retorna o resultado;
		var calcular = {
			fatorial: function(){
				var strRes = 1;
				for(i = num1; i > 1; i--){						
					strRes *= i;
				}
				return num1+"! = "+strRes;
			},
	
    }

    switch(operador)
		{
			case "+":
			case "-":
			case "/":
			case "*":
				var StrExpressao = num1 + operador + num2;
				//método eval realiza uma operaçao de strings e retorna do tipo number
				resultado = eval(StrExpressao); break;					
			/*case "raiz":
				resultado = "&radic;"+num1 + " = " + Math.sqrt(num1); break;					
			case "potencia":
				resultado = num1+"<sup>"+num2 +"</sup> = "+ Math.pow(num1, num2); break;					
			case "fatorial":
				resultado = calcular['fatorial'](); break;					
			case "fibonacci":
				resultado = calcular['fibonacci'](); break;					
			case "porcento":
				resultado = calcular['porcentagem'](); break;
			case "media":
				resultado = calcular['media'](); break;
			case "calc":
				resultado = eval(num1); break;*/
			default:
				break;				
			
		}	

    document.getElementById("saida").innerHTML = "Resultado: "+ 
            
    resultado;
		

  }

</script>

<template>

    <fieldset>
    <body bgcolor="beige">
		<h1>Calculadora</h1>
		<label>Valor 1</label><br>
		<input type="text" id="txtValor1"><br><br>
		<label>Valor 2</label><br>
		<input type="text" id="txtValor2" size="20"><br><br>	
			<select id="operadores" onchange="ControleDeSelecao();">
				<optgroup label="Basico">
					<option value="+">	+(somar)</option>
					<option value="-">	-(subtrair)</option>
					<option value="*">	*(multiplicar)</option>
					<option value="/">	/(dividir)</option>
				</optgroup>
				
			</select>
			
		<input type="button" @click="Calcular('txtValor1', 'txtValor2')" value="Calcular">
		<input type="button" v-on:click="Limpar('txtValor1', 'txtValor2')" value="Limpar">
		<h3 id="saida">Resultado:<span>{{ Calcular.resultado}}</span></h3>
		<hr>		
	</body>
  </fieldset>
  
  
</template>

<style scoped>

</style>
