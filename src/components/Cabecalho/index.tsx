import styled from 'styled-components'

const Cabecalho = styled.header`
  background-color: var(--cor-secundaria);
  color: var(--cor-principal);
  text-align: center;
  padding: 24px 0;
`

function Cabe(){
  return <Cabecalho><h1>EBAC EMPREGO</h1></Cabecalho>
}

export default Cabe

