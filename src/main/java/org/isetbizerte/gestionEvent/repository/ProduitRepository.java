package org.isetbizerte.gestionEvent.repository;

import org.isetbizerte.gestionEvent.Entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProduitRepository extends JpaRepository <Produit, Long>{

public List<Produit> findProduitByDesignation(String designation) ;

}
