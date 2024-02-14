class Pessoa {
  constructor(nome, idade, genero, endereco) {
      this.nome = nome;
      this.idade = idade;
      this.genero = genero;
      this.endereco = endereco;
  }


  getGente() {
      return `A ${this.nome} tem ${this.idade} e mora na ${this.endereco} e o gênero dela é ${this.genero}!`;
  }


  saudacao() {
      console.log(`OI! Eu sou ${this.nome}`);
  }
}

//Subclasse Profissão
class Profissao extends Pessoa {
    constructor(nome, idade, genero, endereco, estudante){
        super(nome, idade, genero, endereco);
        this.estudante = estudante;
    }

    humanas() {
        console.log(`Estudante universitária(o) do curso de ${this.estudante} !`);
    }
}

//Subclasse Pesquisador
class Pesquisa extends Pessoa {
    constructor(nome, idade, genero, endereco,descoberta) {
        super(nome, idade, genero, endereco);
        this.descoberta = descoberta;
    }

    ciencia() {
        console.log(`Pesquisa científica realizada para a descoberta da ${this.descoberta} !`);
    }
}

// Criando uma instância da classe Pessoa
const persona = new Pessoa("Rita", 40, "Feminino", "Av Brasil");
const curso = new Profissao("Maria", 17, "Feminino", "Rua Toledi", "Ciências Humanas");
const science = new Pesquisa("Duilia de Mello", 61, "Feminino", "Goddard Space Flight Center da NASA", "Maior galáxia espiral já conhecida, NGC6872");

// Chamando o método saudacao da instância persona
persona.saudacao();
console.log("\nSaudação: ", persona);
// Chamando o método getGente da instância persona
console.log(persona.getGente(),"</br>");

//Chamada do método saudacao e humanas da instância curso.
curso.saudacao();
console.log("\nProfissional: ", curso);
curso.humanas();

//Chamada do método saudacao e ciencia da instância science.
science.saudacao();
console.log("\nPesquisadora: ", science);
science.ciencia();
