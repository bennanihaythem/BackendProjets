package com.sip.devops.services;

import java.util.List;

import com.sip.devops.entities.Compte;

public interface CompteService {
	
	Compte saveCompte(Compte c);
	List<Compte>findCompte();

}
