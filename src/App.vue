<template>
  <div>
   <header>
    <h1>Calculadora</h1>
   </header>
   <main>
    <label>Número 1 : </label>
    
   <div>
    
    <div v-if="calcularSoma">
     <input
      v-model="estado.input1"
      @input="calcularSoma"
      type="number"
      class="form-control no-spinner"
      placeholder="Adicionar Número"
     />
    </div>

    <div v-else-if="calcularMultiplicacao">
      <input v-model="estado.input1"
       @input="calcularMultiplicacao" 
       type="number"
       class="form-control no-spinner"
       placeholder="Adicionar Número"
       >
    </div>

    <div v-else-if="calcularDiminuicao">
      <input v-model="estado.input1"
       @input="calcularDiminuicao" 
       type="number"
       class="form-control no-spinner"
       placeholder="Adicionar Número"
       >
    </div>
    
    <div v-else-if="calcularDivisao">
      <input v-model="estado.input1"
       @input="calcularDivisao" 
       type="number"
       class="form-control no-spinner"
       placeholder="Adicionar Número"
       >
    </div>

  </div>

    <br /><br />

    <label>Número 2 : </label>

  <div>
    
    <div v-if="calcularSoma">
    <input
     v-model="estado.input2"
     @input="calcularSoma"
     type="number"
     class="form-control no-spinner"
     placeholder="Adicionar Número"
    />
    </div>
    
    <div v-else-if="calcularMultiplicacao">
    <input
     v-model="estado.input2"
     @input="calcularMultiplicacao"
     type="number"
     class="form-control no-spinner"
     placeholder="Adicionar Número"
    />
    </div>

    <div v-else-if="calcularDiminuicao">
    <input
     v-model="estado.input2"
     @input="calcularDiminuicao"
     type="number"
     class="form-control no-spinner"
     placeholder="Adicionar Número"
    />
    </div>

     <div v-else-if="calcularDivisao">
    <input
     v-model="estado.input2"
     @input="calcularDivisao"
     type="number"
     class="form-control no-spinner"
     placeholder="Adicionar Número"
    />
    </div>

  </div>

    <br /><br />
    
    <label>Soma : </label>
    <span>{{ estado.resultadoSoma }}</span><br><br>
    

    <label>Multiplicação : </label>
      <span>{{ estado.resultadoMult }}</span><br><br>
    

    <label>Subtração : </label>
    <span>{{ estado.resultadoDimin }}</span><br><br>


    <label>Divisão : </label>
      <span>{{ estado.resultadoDiv }}</span><br><br>
    
  
  </main>
  </div>
 </template>
 
 <script setup>
 import { reactive } from "vue";
 
 const estado = reactive({
  input1: 0,
  input2: 0,
  resultadoSoma: 0,
  resultadoMult: 0,
  resultadoDimin: 0,
  resultadoDiv:0
 });
 
 const calcularSoma = () => {
  estado.resultadoSoma = estado.input1 + estado.input2;
 };

 const calcularMultiplicacao = () => {
  estado.resultadoMult = estado.input1 * estado.input2;
 };

 const calcularDiminuicao = () => {
  estado.resultadoDimin = estado.input1 - estado.input2;
 };

 const calcularDivisao = () => {
  estado.resultadoDiv = estado.input1 / estado.input2;
 };
 
 </script>
 
 <style scoped>
 /* Estilos opcionais */
   /*@input="calcularResultado"*/
   /*@input="calcularResultado"*/
 header {
  background-color: #f0f0f0;
  padding: 10px;
  text-align: center;
 }
 main {
  padding: 20px;
 }
 input[type="number"] {
  width: 100px;
 }
 </style>
 
