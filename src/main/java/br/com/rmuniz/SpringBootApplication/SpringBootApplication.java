package br.com.rmuniz.SpringBootPrimeiroExemplo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import br.com.rmuniz.domain.Produto;
import br.com.rmuniz.repository.IProdutoRepository;

@SpringBootApplication
@Configuration
@EnableJpaRepositories(basePackages = "br.com.rmuniz.repository")
@EntityScan("br.com.rmuniz.*")
@ComponentScan(basePackages = "br.com.rmuniz")
public class SpringBootApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(SpringBootApplication.class);
	
	@Autowired
	private IProdutoRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("StartApplication...");
		Produto produto = createProduto();
		repository.save(produto);
	}
	
	private Produto createProduto() {
		return Produto.builder()
				.cidade("São Paulo")
				.codigo(12312312310L)
				.email("Teste@teste.com")
				.end("Centro")
				.estado("SP")
				.descricao("Notebook")
				.qtd(20L)
				.obs("TESTE")
				.valor(5000.00)
				.build();
	}

}
