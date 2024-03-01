//Exercício do módulo 25 EBAC

//const nomes = ['Renata', 'Roberta', 'Priscila', 'Rita', 'Ronaldo', 'Peterson'];

//const notas = [8, 7, 9, 5, 4, 3];

let estudantes = [
    { nomes: 'Renata',  nota: 8 },
    { nomes: 'Roberta', nota: 9 },
    { nomes: 'Priscila',nota: 5 },
    { nomes: 'Rita',    nota: 5 },
    { nomes: 'Ronaldo', nota: 6 },
    { nomes: 'Peterson',nota: 4 }
  ];


/*estudantes.filter(function(nomesDosAlunos, resultado) {
      
        if (estudantes.nota>=6){
          console.log(`Aluna(o)s: ${nomesDosAlunos} | Notas ${resultado}`);
        }
     } )*/

let alunosAprovados = estudantes.filter(aluno => aluno.nota >= 6)


console.log(alunosAprovados)
