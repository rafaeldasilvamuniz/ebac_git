import styled from 'styled-components'

type Props = {
  titulo: string
  localizacao: string
  nivel: string
  modalidade: string
  salarioMin: number
  salarioMax: number
  requisitos: string[]
}

const vagaLi = styled.li`
  border: 1px solid var(--cor-principal);
  background-color: var(--cor-secundaria);
  color: var(--cor-principal);
  padding: 16px;
  transition: all ease .3s;
  border-radius: 8px;
`

const vagaTitulo = styled.h3`
   font-weight: bold;
   margin-bottom: 16px;
`

const vagaLink = styled.a`
  border-color: var(--cor-secundaria);
  background-color: var(--cor-principal);
  color: var(--cor-secundaria);
  display: inline-block;
  padding: 8px 16px;
  text-decoration: none;
  margin-top: 16px;
  font-weight: bold;
  font-size: 14px;
  border-radius: 8px;
  text-align: center;

  @media (max-width: 768px) {
    display: block;
  }
`

const vagaUl = styled.ul`
 border: 1px solid var(--cor-principal);
 background-color: var(--cor-secundaria);
 color: var(--cor-principal);
 padding: 16px;
 transition: all ease .3s;
 border-radius: 8px;
`

function Vaga = (props: Props){
  return( <vagaLi>
              <vagaTitulo>{props.titulo}</vagaTitulo>
              <vagaUl>
                <vagaLi>Localizacao: {props.localizacao} </vagaLi>
                <vagaLi>Senioridade: {props.nivel} </vagaLi>
                <vagaLi>Tipo de contratação: {props.modalidade} </vagaLi>
                <vagaLi>Salário: {props.salarioMin} - {props.salarioMax} </vagaLi>
                <vagaLi>Requisitos: {props.requisitos.join(', ')} </vagaLi>
              </vagaUl>
              <vagaLink href="#">Ver detalhes e candidatar-se</vagaLink>
         </vagaLi>

  )
}


export default Vaga
