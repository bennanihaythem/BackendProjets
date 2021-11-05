package com.sip.devops;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sip.devops.entities.Compte;
import com.sip.devops.services.CompteService;

@SpringBootApplication
public class BackendProjetsApplication implements CommandLineRunner{

	@Autowired
	private CompteService compteService;
	public static void main(String[] args) {
		SpringApplication.run(BackendProjetsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Hello Compte");
		Compte c=new Compte();
		c.setNom("Haythem");
		compteService.saveCompte(c);
		compteService.findCompte().forEach(c1->System.out.println(c1));
				
	}

}
