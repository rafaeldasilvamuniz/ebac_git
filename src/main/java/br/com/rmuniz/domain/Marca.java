package br.com.rmuniz.domain;

import java.util.ArrayList;

        import java.util.List;

        import javax.persistence.Column;
        import javax.persistence.Entity;
        import javax.persistence.GeneratedValue;
        import javax.persistence.GenerationType;
        import javax.persistence.Id;
        import javax.persistence.ManyToMany;
        import javax.persistence.SequenceGenerator;
        import javax.persistence.Table;

/**
 * @author Rafael da Silva Muniz
 *
 */
@Entity
@Table(name = "TB_MARCA")
public class Marca {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="mar_seq")
    @SequenceGenerator(name="mar_seq", sequenceName="sq_marca", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "CODIGO", length = 10, nullable = false, unique = true)
    private String codigo;

    @Column(name = "nome", length = 50, nullable = false)
    private String nome;

    @ManyToMany(mappedBy = "marcas")
    private List<Marca> marcas;

    public Marca() {
        this.marcas = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Nome> getNomes() {
        return nomes;
    }

    public void setMarca(List<Marca> marcas) {
        this.marcas = marcas;
    }

    public void add(Marca marca) {
        this.marcas.add(marca);
    }

}
