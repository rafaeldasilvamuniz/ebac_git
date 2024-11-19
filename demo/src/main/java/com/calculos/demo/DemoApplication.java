package com.calculos.demo;


import com.calculos.dominio.Calculos;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


@SpringBootApplication
@RefreshScope
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class DemoApplication {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		Calculos c=new Calculos();

		System.out.print(c.calculadora("10+22"));

		SpringApplication.run(DemoApplication.class, args);
	}

}



