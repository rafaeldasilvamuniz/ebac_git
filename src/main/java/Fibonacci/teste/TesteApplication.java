package Fibonacci.teste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class TesteApplication {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Digite o número para a sequência do Fibonacci: ");
		int i = keyboard.nextInt();

		for (int = 0; i <= 50; i++) {
			System.out.println(Fibonacci.fibo(i));
		}

		SpringApplication.run(TesteApplication.class, args);


	}
}
