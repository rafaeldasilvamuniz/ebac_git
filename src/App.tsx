//import React from 'react'
import layout from './layout.png'
import efood from './Efood.png'
import rodape from './rodape.png'
import lista from './listagem.png'
import head from './Header.png'
import apresentacao from './apresentacao.png'
import produto from './produtos.png'
import './App.css'
import { Rodfooter, GlobalCss, RodHeader, Efood, Listagem } from './styles'
import { BrowserRouter } from 'react-router-dom'

//import { createBrowserRouter, RouterProvider, Routes, BrowserRouter } from 'react-router-dom'

function App() {
  return (
    <BrowserRouter>
      <GlobalCss />
      <RodHeader>
        <div className="container">
          <img className="App-logo" src={layout} alt="AppImg" />
        </div>
      </RodHeader>

      <Efood>
        <div className="container">
          <img className="App-efood" src={efood} alt="efood" />
        </div>
      </Efood>

      <Listagem>
        <div className="container">
          <img className="App-lista" src={lista} alt="lista" />
        </div>
      </Listagem>

      <div className="App-layout" id="area-lateral">
        <div>
          <Listagem>
            <div className="container">
              <img className="App-header" src={head} alt="Apphead" />
            </div>

            <div className="container">
              <img
                className="App-apresentacao"
                src={apresentacao}
                alt="AppApresentacao"
              />
            </div>

            <div className="container">
              <img className="App-produto" src={produto} alt="AppProdutos" />
            </div>
          </Listagem>
        </div>
      </div>

      <Rodfooter>
        <div className="container">
          <img className="App-rodape" src={rodape} alt="rodape" />
        </div>
      </Rodfooter>

    </BrowserRouter>

  )
}

export default App
