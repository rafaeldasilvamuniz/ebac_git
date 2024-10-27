///<reference types="cypress" />

describe('Testes home', () => {

  beforeEach({
     cy.visit('https://ebac-jobs-e2e.vercel.app/')
  })
   it('Deve levar até ao formulário de inscrição', () => {
     //cy.visit('https://ebac-jobs-eZe.vercel.app/')
     //cy.get('.ListaVaga_vagas_gmNZ > li').should('have.length',4)
       cy.get('input').should('have.length',7)
       cy.get('.Vaga_vagaLink__DeFKK').first().click()
       cy.get('input[name="nome-completo"]').type('Rafael da Silva')
       cy.get('input[name="email"]').type('rafaelmunizrsm@hotmail.com')
       cy.get('select[name="escolaridade"]').select("Outros")
       cy.get('.Aplicacao_button__tw2AE').click()
       cy.get('#linux').check()

       cy.on('window:alert', (conteudo) => {

          expect(conteudo).contain('Obrigado pela candidatura!')
       })
      })
 })

