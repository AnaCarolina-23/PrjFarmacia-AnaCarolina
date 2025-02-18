package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entitie.Drogaria;
import com.example.demo.service.DrogariaService;

@RestController
@RequestMapping("/drogaria")
public class DrogariaController {

	private final DrogariaService drogariaService;

	@Autowired
	public DrogariaController(DrogariaService drogariaService) {
		this.drogariaService = drogariaService;
	}

	@PostMapping("/inserir")
	public Drogaria criarDrogaria(@RequestBody Drogaria drogaria) {
		return drogariaService.slavarDrogaria(drogaria);
	}

	@GetMapping
	public List<Drogaria> buscarTodosDrogaria() {
		return drogariaService.buscarTodosDrogaria();
	}

	@GetMapping("/{id}")
	public Drogaria buscarPorId(@PathVariable Long id) {
		return drogariaService.buscarDrogariaPorId(id);
	}

	@DeleteMapping("/{id}")
	public void deletarDrogaria(@PathVariable Long id) {
		drogariaService.excluirDrogaria(id);
	}

	@PutMapping
	public ResponseEntity<Drogaria> atualizarDrogaria(@PathVariable Long id, @RequestBody Drogaria drogaria) {
		Drogaria drogariaAtualizado = drogariaService.atualizarDrogaria(id, drogaria);
		if (drogariaAtualizado != null) {
			return ResponseEntity.ok(drogariaAtualizado);
		} else {
			return null;
		}
	}
}