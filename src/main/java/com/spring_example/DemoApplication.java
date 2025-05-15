package com.spring_example;
// 'package' define o "endereço" desta classe no projeto.
// Equivalente a pastas: com/exemplo/DemoApplication.java

// Importa a anotação @SpringBootApplication do Spring Boot
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication é uma anotação que combina três funcionalidades:
// 1. @Configuration: Define que esta classe tem configurações do Spring.
// 2. @EnableAutoConfiguration: Habilita configuração automática do Spring Boot.
// 3. @ComponentScan: Procura por componentes (como controllers) no pacote atual e subpacotes.
@SpringBootApplication
public class DemoApplication {

	// 'public' significa que este método pode ser acessado de fora da classe.
	// 'static' significa que o método pertence à classe, não a uma instância.
	// 'void' indica que o método não retorna nada.
	// 'main' é o nome do método (ponto de entrada padrão em Java).
	// 'String[] args' são argumentos passados via linha de comando.
	public static void main(String[] args) {
		// SpringApplication.run() inicia a aplicação Spring Boot.
		// DemoApplication.class é a classe principal.
		// args são os argumentos passados para a aplicação.
		SpringApplication.run(DemoApplication.class, args);
	}
}