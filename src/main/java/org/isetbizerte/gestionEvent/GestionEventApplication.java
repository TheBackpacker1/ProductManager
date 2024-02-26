package org.isetbizerte.gestionEvent;

import org.isetbizerte.gestionEvent.Entity.Produit;
import org.isetbizerte.gestionEvent.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestionEventApplication  implements CommandLineRunner {

@Autowired
	ProduitRepository produitRepository ;
	public static void main(String[] args) {
		SpringApplication.run(GestionEventApplication.class, args);


	}

	@Override
	public void run(String... args) throws Exception {
		Produit produit = new Produit(null,"clavier","clavier est azerty") ;

        produit= produitRepository.save(produit) ;

		 produit = new Produit(null,"souris","souris de marque MSI") ;

		produit= produitRepository.save(produit) ;
	}
}
