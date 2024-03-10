package org.isetbizerte.gestionEvent.Service;

import org.isetbizerte.gestionEvent.Entity.Produit;

import java.util.List;

public interface ProduitService {


    public List<Produit> getProductlist() ;

    public Produit getbyId(long id) ;

    public Produit AddProduct(Produit produit) ;

    Produit ModifProduct(Produit produit);

    public void deleteProduct(Long id) ;

}
