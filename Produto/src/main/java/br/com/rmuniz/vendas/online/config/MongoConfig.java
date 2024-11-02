/**
 * 
 */
package br.com.rmuniz.vendas.online.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @author Rafael da Silva Muniz
 *
 */
@Configuration
@EnableMongoRepositories(basePackages = "br.com.rmuniz.vendas.online.repository")
public class MongoConfig {

}
