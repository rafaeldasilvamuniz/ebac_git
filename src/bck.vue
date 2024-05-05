<script setup>
import HelloWorld from './components/HelloWorld.vue'
import TheWelcome from './components/TheWelcome.vue'
//const nome = "Teste"
const meuTst = {
   nome: "Teste Testando",
   filmeTeste: "Teste"
}

const result = "0";
//let contador = 0;

function Ola(nome) {
  return `${nome} diz teste`; 
}

function decrementar(){
   contador--;
}

function incrementar(){
   contador++;
}

/*const estado = reactive({
    contador: 0,
})*/

const gosti = true;
const imagem = "https://blog.giulianaflores.com.br/historia-curiosidades-baoba/";

</script>

<template>
  <header>
    <img alt="Vue logo" class="logo" src="./assets/logo.svg" width="125" height="125" />
    <!--<h1>{{Ola("Paula")}}</h1>-->
    <img v-if="gosti" src="/baoba.jpg" alt="baoba"/>

    
    <br/>
    <br/>
    <hr/>

    <!--{{contador}}-->

    <!--{{estado.contador}}
    {{estado.email}}
    <input type="email" @keyup="evento => estado.email = evento.target.valeu">
    -->

    {{primnum}}
    <h4>Digite o primeiro número</h4>
    <input type="number" v-model="num1" @keyup="evento => estado.email = evento.target.value">
    <br/>
    <br/>
    <hr/>

    {{segnum}}
    <h4>Digite o segundo número</h4>
    <input type="number" v-model="num2" @keyup="evento => estado.email = evento.target.value">
    <br/>
    <br/>
    <hr/>


    <div class="wrapper">
      <!--<HelloWorld msg="You did it!" />-->
    </div>
  </header>

  <main>
    <!--<TheWelcome />-->
  </main>
  <button type="button" id="um">1</button>
  <button type="button" id="dois">2</button>
  <button type="button" id="tres">3</button>
  <button type="button" id="quatro">4</button>
  <button type="button" id="cinco">5</button>
  <button @click="incrementar" type="button" id="mais">+</button>
  <button type="button" id="multiplicar">*</button><br/>
  <button type="button" id="seis">6</button>
  <button type="button" id="sete">7</button>
  <button type="button" id="oito">8</button>
  <button type="button" id="nove">9</button>
  <button type="button" id="zero">0</button>
  <button @click="decrementar" type="button" id="menos">-</button>
  <button type="button" id="dividir">-:-</button><br/>
  <button :disabled="false">Enviar</button>

//if (id=="mais"){  
  //const result = input1 + input2; 
  //const result = 1+1;
  <!--{{ result }}-->
//}

<p>Resultado: {{ result = num1+num2 }}</p>

</template>

<style scoped>
header {
  line-height: 1.5;
}

.logo {
  display: block;
  margin: 0 auto 2rem;
}

@media (max-width: 100px) {
  template, header, button {
    display: flex;
    place-items: center;
    padding-right: calc(var(--section-gap) / 2);
  }

  .logo {
    margin: 0 2rem 0 0;
  }

  header .wrapper {
    display: flex;
    place-items: flex-start;
    flex-wrap: wrap;
  }
}
</style>
