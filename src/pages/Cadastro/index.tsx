import BarraLateral from '../../containers/BarraLateral'
import Formulario from '../../containers/Formulario'

const Cadastro = () => (
  <>
   <BarraLateral mostrarFiltros={false} />
   <Formulario />
  </>
)

export default Cadastro

/*<>
   <form>
    <input type="text" placeholder="Título" />
    <textarea placeholder="Descrição da Tarefa" />
      <input type="radio" id="urgente" /> <label htmlFor="urgente">Urgente</label>
      <input type="radio" id="importante" />
      <label htmlFor="importante">Importante</label>
      <input type="radio" id="normal" /> <label htmlFor="Normal">Normal</label>
      <button type="submit">Cadastrar</button>
   </form>
  </>*/
