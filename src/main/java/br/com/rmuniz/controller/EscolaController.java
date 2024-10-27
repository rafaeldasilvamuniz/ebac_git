/**
 * 
 */
package br.com.rmuniz.controller;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.rmuniz.domain.Escola;
import br.com.rmuniz.service.IEscolaService;

/**
 * @author Rafael da Silva Muniz
 *
 */
@Named
@ViewScoped
public class EscolaController implements Serializable {

	private static final long serialVersionUID = 8030245985235567808L;
	
	private Escola escola;
	
	private Collection<Escola> escolas;
	
	@Inject
	private IEscolaService escolaService;
	
	private Boolean isUpdate;
	
	@PostConstruct
    public void init() {
		try {
			this.isUpdate = false;
			this.escola = new Escola();
			this.escolas = escolaService.buscarTodos();
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage("growl", new FacesMessage("Erro ao tentar listar as escolas"));
		}
	}
	
	public void cancel() {
		try {
			this.isUpdate = false;
			this.escola = new Escola();
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage("growl", new FacesMessage("Erro ao tentar cancelar a ação"));
		}
		
    } 
	
	public void edit(Escola escola) {
		try {
			this.isUpdate = true;
			this.escola = escola;
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage("growl", new FacesMessage("Erro ao tentar excluir a escola"));
		}
		
    } 
	
	public void delete(Escola escola) {
		try {
			escolaService.excluir(escola);
			escolas.remove(escola);
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage("growl", new FacesMessage("Erro ao tentar excluir a escola"));
		}
		
    } 
	
	public void add() {
		try {
			escolaService.cadastrar(escola);
			this.escolas = escolaService.buscarTodos();
			this.escola = new Escola();
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage("growl", new FacesMessage("Erro ao tentar criar a escola"));
		}
		
        
    }

    public void update() {
    	try {
			escolaService.alterar(this.escola);
			cancel();
			FacesContext.getCurrentInstance().addMessage("growl", new FacesMessage("Escola Atualiada com sucesso"));
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage("growl", new FacesMessage("Erro ao tentar atualizar a escola"));
		}
        
    }

	public Collection<Escola> getEscolas() {
		return escolas;
	}

	public void setEscolas(Collection<Escola> escolas) {
		this.escolas = escolas;
	}

	public Escola getEscola() {
		return escola;
	}

	public void setEscola(Escola escola) {
		this.escola = escola;
	}

	public Boolean getIsUpdate() {
		return isUpdate;
	}

	public void setIsUpdate(Boolean isUpdate) {
		this.isUpdate = isUpdate;
	}
	
	

}
