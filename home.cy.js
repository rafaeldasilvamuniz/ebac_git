///<reference types="cypress" />

describe('Testes home', () => {
  // beforeEach(() => {
    //  cy.visit('https://agenda-contatos-react.vercel.app')
   //})


   it('Formulario Inseri dados', () => {
     //cy.visit('https://fake-api-tau.vercel.app/api/contatos')
     cy.visit('https://agenda-contatos-react.vercel.app')
     cy.get('input[type="text"]').type('Rafael da Silva Muniz')
     cy.get('input[type="email"]').type('rafaelmunizrsm@hotmail.com')
     cy.get('input[type="tel"]').type('22 99999-9999')
     //cy.get('.adicionar').first().click()
     cy.get('button[type="submit"]').click()
     //cy.get('button[type="adicionar"]').click()
    })

    it.only('Formulario Exclui dados', () => {
      //const entrada = 'Mesada'


      //cy.visit('https://fake-api-tau.vercel.app/api/contatos')
      /*cy.visit('https://agenda-contatos-react.vercel.app')
      cy.get('input[type="text"]').type('Rafael da Silva Muniz')
      cy.get('input[type="email"]').type('rafaelmunizrsm@hotmail.com')
      cy.get('input[type="tel"]').type('22 99999-9999')
      //cy.get('.adicionar').first().click()*/
	  cy.visit('https://agenda-contatos-react.vercel.app')
      cy.get(':nth-child(5) > .sc-gueYoa > .delete')
      cy.get('button[type="button"]').click()
      //cy.get('button[type="adicionar"]').click()
     })

})



