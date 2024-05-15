<script setup>
//import HelloWorld from './components/HelloWorld.vue'
//import TheWelcome from './components/TheWelcome.vue'
import { reactive } from 'vue';

const estado = reactive({
 filtro: "+",
 input1: "",
 input2: "",
 resultado: ""
})

new calculo({
	soma: '#app',
	data: {
		count1: 0,
		count2: 0,
		result: 0
	},
	methods: {
		sum(){
           return result = this.count1 + this.count2;
		}
	}
});

</script>

<template>
  <header>
    <!--<img alt="Vue logo" class="logo" src="./assets/logo.svg" width="125" height="125" />

    <div class="wrapper">
      <HelloWorld msg="You did it!" />
    </div>-->
  </header>

  <main>
    <!--<TheWelcome />-->
      <h1>Calculadora</h1><br>
  </main>
  <label>Número 1  :   </label>
  <input v-model="estado.input1" @input="mostraResultado" type="number" class="form-control no-spinner" placeholder="Adicionar Número" value="Resultado"><br><br>
  <label>Número 2  :   </label>
  <!--<input v-model="estado.input2" @input="mostraResultado" type="number" class="form-control no-spinner" placeholder="Adicionar Número" value="Resultado"><br><br>
  <input type="button" onclick="Calcular('txtValor1', 'txtValor2')" value="Calcular"><br><br>
  <input type="button" onclick="Limpar('input1','input2')" value="Limpar"><br><br>-->
  <div id="app">
    <span>{{  }}</span>
  </div>
</template>

<!--<style scoped>
/*header {
  line-height: 1.5;
}

.logo {
  display: block;
  margin: 0 auto 2rem;
}

@media (min-width: 1024px) {
  header {
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

}*/
</style>-->
