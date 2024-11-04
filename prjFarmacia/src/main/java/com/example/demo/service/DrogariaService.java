package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entitie.Drogaria;
import com.example.demo.repository.DrogariaRepository;

@Service
public class DrogariaService {

	private final DrogariaRepository drogariaRepository;

	@Autowired
	public DrogariaService(DrogariaRepository drogariaRepository) {
		this.drogariaRepository = drogariaRepository;
	}

	public Drogaria slavarDrogaria(Drogaria drogaria) {
		return drogariaRepository.save(drogaria);
	}

	public Drogaria buscarDrogariaPorId(Long id) {
		return drogariaRepository.findById(id).orElse(null);
	}

	public List<Drogaria> buscarTodosDrogaria() {
		return drogariaRepository.findAll();
	}

	public void excluirDrogaria(Long id) {
		drogariaRepository.deleteById(id);
	}

	public Drogaria atualizarDrogaria(Long id, Drogaria drogariaAtualizado) {
		Optional<Drogaria> drogariaExistente = drogariaRepository.findById(id);
		if (drogariaExistente.isPresent()) {
			Drogaria drogaria = drogariaExistente.get();
			drogaria.setNome(drogariaAtualizado.getNome());
			drogaria.setCnpj(drogariaAtualizado.getCnpj());
			return drogariaRepository.save(drogaria);
		} else {
			return null;
		}
	}
}