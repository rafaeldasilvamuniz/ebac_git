import { createSlice, PayloadAction } from "@reduxjs/toolkit";

import { Produto } from "../../components/Produto/styles";
import { Produto } from "../../App";

type CarrinhoState = {
  itens: Produto[]
}

const initialState: CarrinhoState = {
  itens: []
}

const carrinhoSlice = createSlice({
  name: 'carrinho',
  initialState,
  reducers: {
    adicionar: (state, action: PayloadAction<Produto>) => {
      const produto = action.payload;

      if (state.itens.find(produto => produto.id === produto.nome )){
        alert('Item adicionado')
      } else {
        state.itens.push(produto)
//state.nome = produto.nome

//[...itens, Produto ]
      }
    }
  }
})

export const { adicionar } = carrinhoSlice.actions.adicionar
export default carrinhoSlice.reducer
