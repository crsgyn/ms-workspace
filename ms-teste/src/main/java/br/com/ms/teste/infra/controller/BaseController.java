package br.com.ms.teste.infra.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import br.com.ms.teste.infra.model.BaseEntity;
import br.com.ms.teste.infra.repository.BaseRepository;

@CrossOrigin
public abstract class BaseController<E extends BaseEntity, R extends BaseRepository<E>> {

	@Autowired
	private R repository;
	
	@PostMapping
	@ResponseStatus(code=HttpStatus.CREATED)
	public E save(@RequestBody E entity) {
		return repository.save(entity);
	}
	
	@GetMapping
	public List<E> findAll() {
		return repository.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<E> findById(@PathVariable Long id) {
		Optional<E> entity = repository.findById(id);
		if (entity.isPresent()) {
			return ResponseEntity.ok(entity.get());
		}
		return ResponseEntity.notFound().build();
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(code=HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		repository.delete(
				repository.findById(id).get()
				);
	}

}
