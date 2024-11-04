/// <reference types="cypress" />

describe("Testes para a edição", () => {
  beforeEach(() => {
    cy.visit('https://agenda-contatos-react.vercel.app/')
  })

  it('Deve alterar o contato da agenda', () => {
    cy.get(':nth-child(5) > .sc-dmqHEX > .edit').click()
    cy.get('[type="text"]').clear()
    cy.get('[type="text"]').type('Rafael da Silva Muniz')
    cy.get('[type="email"]').clear()
    cy.get('[type="email"]').type('rafaelmunizrsmteste@teste.com')
    cy.get('[type="tel"]').clear()
    cy.get('[type="tel"]').type('22 99900-0000')
    cy.get('.alterar').click()
  })
})
