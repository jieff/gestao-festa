package com.empresa.festa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.festa.model.Convidado;

public interface Convidados extends JpaRepository<Convidado, Long> {
	

}
