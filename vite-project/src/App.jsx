import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'

function App(){

const form = document.querySelector('#form');

/*form.addEventListener('submit', function (e) {
    e.preventDefault();
    const inputPeso = e.target.querySelector('#peso');
    const inputAltura = e.target.querySelector('#altura');
    const peso = Number(inputPeso.value);
    const altura = Number(inputAltura.value);

    if (!peso) {
        setResultado('Peso inválido', false);
        return;
    }

    if (!altura) {
        setResultado('Altura inválida', false);
        return;
    }

    const imc = getImc(peso, altura);
    const nivelImc = getNivelImc(imc);

    const msg = `Seu IMC é ${imc} (${nivelImc}).`;

    setResultado(msg, true);
});*/


function getNivelImc(imc) {
    const nivel = ['Abaixo do peso', 'Peso normal', 'Sobrepeso', 'Obesidade grau 1', 'Obesidade grau 2', 'Obesidade grau 3'];

    if (imc >= 39.9) return nivel[5];
    if (imc >= 34.9) return nivel[4];
    if (imc >= 29.9) return nivel[3];
    if (imc >= 24.9) return nivel[2];
    if (imc >= 18.5) return nivel[1];
    if (imc < 18.5) return nivel[0];
}

function getImc(peso, altura) {
    const imc = peso / altura ** 2;
    return imc.toFixed(2);
}

function criaP(className) {
    const p = document.createElement('p');
    return p;
}

function setResultado(msg, isValid) {
    const resultado = document.querySelector('#resultado');
    resultado.innerHTML = '';

    const p = criaP();

    if (isValid) {
        p.classList.add('paragrafo-resultado')
    } else {
        p.classList.add('erro');
    }

    p.innerHTML = msg;
    resultado.appendChild(p);
}

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
        <input type="text" id="peso" name="peso"></input>
      </div>
      <div className="card">
             <label><b>Altura</b></label>
            </div>
    <div>
      <div>
        <input type="text" id="altura" name="altura"></input>
       </div>
      <button onClick={}>
               Enviar
       </button>
       <p>Resultado: {}</p>
    
    </div>
     
    </>
  )
}

export default App
