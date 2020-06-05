package br.com.rasek.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rasek.api.documents.Cliente;
import br.com.rasek.api.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService{
	
	@Autowired
	private ClienteRepository clienteRepository;
	

	@Override
	public List<Cliente> listarTodos() {
		// TODO Auto-generated method stub
		return this.clienteRepository.findAll();
	}

	@Override
	public Optional<Cliente> listarPorId(String id) {
		// TODO Auto-generated method stub
		return this.clienteRepository.findById(id);
	}

	@Override
	public Cliente cadastrar(Cliente cliente) {
		// TODO Auto-generated method stub
		return this.clienteRepository.save(cliente);
	}

	@Override
	public Cliente atualizar(Cliente cliente) {
		// TODO Auto-generated method stub
		return this.clienteRepository.save(cliente);
	}

	@Override
	public void remover(String id) {
		// TODO Auto-generated method stub
		this.clienteRepository.deleteById(id);
	}

}
