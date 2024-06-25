import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'

function App(){

const [altura, setAltura] = useState('');
const [peso, setPeso] = useState('');
const [imc, setImc] = useState('');    

function getNivelImc() {
    const nivel = ['Abaixo do peso', 'Peso normal', 'Sobrepeso', 'Obesidade grau 1', 'Obesidade grau 2', 'Obesidade grau 3'];

    if (!imc) return '';
    else if (imc >= 39.9) return nivel[5];
    else if (imc >= 34.9) return nivel[4];
    else if (imc >= 29.9) return nivel[3];
    else if (imc >= 24.9) return nivel[2];
    else if (imc >= 18.5) return nivel[1];
    else if (imc < 18.5) return nivel[0];
}

function calculaImc() {
    const imc = peso / ((altura/100) ** 2);
    setImc(imc.toFixed(2));
   // return imc.toFixed(2);
}

/*function criaP(className) {
    const p = document.createElement('p');
    return p;
}*/


  return (
    <>
      <div>
        <a href="https://vitejs.dev" target="_blank">
          <img src={viteLogo} className="logo" alt="Vite logo" />
        </a>
        <a href="https://react.dev" target="_blank">
          <img src={reactLogo} className="logo react" alt="React logo" />
        </a>
      </div>
      <h1>Calcule seu IMC</h1>
      <div className="card">
       <label><b>Peso</b></label>
      </div>
      <div>
        <input type="text" id="peso" name="peso" onChange={(e) => setPeso(e.target.value)}></input>
      </div>
      <div className="card">
        <label><b>Altura</b></label>
      </div>
    <div>
      <div>
         <input type="text" id="altura" name="altura" onChange={(e) => setAltura(e.target.value)}></input>
      </div>
      <button onClick={calculaImc}>
               Enviar
      </button>
       <p>Resultado: {getNivelImc()}</p>    
    </div>
     
    </>
  )
}

export default App
