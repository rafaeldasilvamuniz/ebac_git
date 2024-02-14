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


// Criando uma instância da classe Pessoa
const persona = new Pessoa("Rita", 40, "Feminino", "Av Brasil");


// Chamando o método saudacao da instância persona
persona.saudacao();


// Chamando o método getGente da instância persona
console.log(persona.getGente());