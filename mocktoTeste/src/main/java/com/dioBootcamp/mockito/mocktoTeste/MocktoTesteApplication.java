package com.dioBootcamp.mockito.mocktoTeste;

import org.example.Cliente;
import org.example.Conta;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MocktoTesteApplication {

	public static void main(String[] args) {
		SpringApplication.run(MocktoTesteApplication.class, args);

		System.out.println("olá Rafael!");

		Conta conta = new Conta(1212,45.5);

		System.out.println(conta.getSaldo());

        conta.setSaldo(conta.getSaldo() + 20.0);

		System.out.println(conta.getSaldo());

		Cliente cliente = new Cliente();

		cliente.setIdade(35);
		cliente.setNome("Rafael");
		System.out.println(cliente.getIdade());
	}



}
