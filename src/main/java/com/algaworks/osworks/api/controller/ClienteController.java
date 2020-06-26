package com.algaworks.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.osworks.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List <Cliente> listar() {
		var cliente = new Cliente();
		var cliente2 = new Cliente();
		
		cliente.setId(1L);
		cliente.setNome("Tobias");
		cliente.setTelefone("98 98886-7483");
		cliente.setEmail("tobiassilva@hotmail.it");
		
		cliente2.setId(2L);
		cliente2.setNome("Tomas");
		cliente2.setTelefone("98 98713-2297");
		cliente2.setEmail("tomassilva@hotmail.it");
		
		return Arrays.asList(cliente, cliente2);
	}
}
