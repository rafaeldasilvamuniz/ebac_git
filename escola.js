//Exercício do módulo 25 EBAC

const nomes = ['Renata', 'Roberta', 'Priscila', 'Rita', 'Ronaldo', 'Peterson'];

const notas = [8, 7, 9, 5, 4, 3];

nomes.forEach(function(nomesDosAlunos, indice) {
    notas.forEach(function(notasAlunas, indices){
    
        if (indice===indices & notasAlunas>=6) {
            console.log(`#${indice} Aluna(o)s: ${nomesDosAlunos} | Notas ${notasAlunas}`);
        }
        
    })
})
