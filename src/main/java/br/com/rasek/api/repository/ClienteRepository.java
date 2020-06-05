package br.com.rasek.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.rasek.api.documents.Cliente;

public interface ClienteRepository extends MongoRepository<Cliente, String> {

}
