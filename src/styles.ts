import styled, { createGlobalStyle } from 'styled-components'

export const cores = {
  branca: '#FFFFFF',
  preta: '#000000',
  cinza: '#808080',
  verde: '#10AC84',
  vermelho: '#FF0000',
  rosa: '#ff007f',
  salmao: '#FA8072',
  salmao2: '#E66767'
}

export const GlobalCss = createGlobalStyle`

*{
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  font-family: Roboto, sans-serif;
}

body {
  background-color: ${cores.branca};
  color: ${cores.preta};
}

`

/*.body{
  background-color: ${cores.preta};
  color: ${cores.branca};
  padding-top: 40px;
}*/

/*.Container {
  max-width: 1024px;
   width: 100%;
   margin: 0 auto;
}*/

export const Divisoria = styled.div`
  max-width: 1024px;
  width: 80%;
  margin: 0 auto;
`
/*export const Layout = styled.header`
  display: block;
  background-repeat: no-repeat;
  background-size: cover;
  font-weight: bold;
  padding-top: 340px;
  width: 2772px;
  height: 300px;
  top: -601px;
  left: -228px;
  gap: 0px;
  opacity: 0px;

  .container {
    position: relative;
    padding-top: 340px;
    display: flex;
    justify-content: space-between;
    align-items: flex-end;
  }
`*/

export const Rodfooter = styled.footer`
  background-color: ${cores.branca};
  padding: 40px 0;
`
export const RodHeader = styled.header`
  background-color: ${cores.branca};
  padding: 40px 0;
`
export const Efood = styled.body`
  background-color: ${cores.branca};
  padding: 20px 0;
`
export const Listagem = styled.body`
  background-color: ${cores.branca};
  border: 1px 0px 0px 0px;
  border: Mixed solid ${cores.salmao2};
  opacity: 0px;
  padding: 40px 0;
`
