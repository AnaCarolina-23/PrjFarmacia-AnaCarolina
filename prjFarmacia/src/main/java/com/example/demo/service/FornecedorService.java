package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entitie.Fornecedor;
import com.example.demo.repository.FornecedorRepository;

@Service
public class FornecedorService {

	private final FornecedorRepository fornecedorRepository;

	@Autowired
	public FornecedorService(FornecedorRepository fornecedorRepository) {
		this.fornecedorRepository = fornecedorRepository;
	}

	public Fornecedor slavarFornecedor(Fornecedor fornecedor) {
		return fornecedorRepository.save(fornecedor);
	}

	public Fornecedor buscarFornecedorPorId(Long id) {
		return fornecedorRepository.findById(id).orElse(null);
	}

	public List<Fornecedor> buscarTodosFornecedor() {
		return fornecedorRepository.findAll();
	}

	public void excluirFornecedor(Long id) {
		fornecedorRepository.deleteById(id);
	}

	public Fornecedor atualizarFornecedor(Long id, Fornecedor fornecedorAtualizado) {
		Optional<Fornecedor> fornecedorExistente = fornecedorRepository.findById(id);
		if (fornecedorExistente.isPresent()) {
			Fornecedor fornecedor = fornecedorExistente.get();
			fornecedor.setRazaoSoc(fornecedorAtualizado.getRazaoSoc());
			fornecedor.setNomeFant(fornecedorAtualizado.getNomeFant());
			fornecedor.setCnpj(fornecedorAtualizado.getCnpj());
			fornecedor.setEndereco(fornecedorAtualizado.getEndereco());
			fornecedor.setFone(fornecedorAtualizado.getFone());
			fornecedor.setEmail(fornecedorAtualizado.getEmail());
			fornecedor.setInscEst(fornecedorAtualizado.getInscEst());
			return fornecedorRepository.save(fornecedor);
		} else {
			return null;
		}
	}
}