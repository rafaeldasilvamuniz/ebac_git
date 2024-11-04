/// <reference types="cypress" />

describe("Testes para a exclusão", () => {
  beforeEach(() => {
    cy.visit('https://agenda-contatos-react.vercel.app/')
  })

  it('Deve excluir o contato', () => {
    cy.get(':nth-child(5) > .sc-dmqHEX > .delete').click()
  })
})


