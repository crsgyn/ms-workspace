package br.com.ms.teste.infra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ms.teste.infra.model.BaseEntity;

public interface BaseRepository<E extends BaseEntity> extends JpaRepository<E, Long> {

}
