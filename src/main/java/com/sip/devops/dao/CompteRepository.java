package com.sip.devops.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import com.sip.devops.entities.Compte;

@RepositoryRestController
public interface CompteRepository extends JpaRepository<Compte, Long>{

}
