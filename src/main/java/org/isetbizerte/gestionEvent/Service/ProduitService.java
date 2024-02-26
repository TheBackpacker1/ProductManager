package org.isetbizerte.gestionEvent.Service;

import org.isetbizerte.gestionEvent.Entity.Produit;

import javax.swing.*;
import java.util.List;

public interface ProduitService {


    public List<Produit> getProductlist() ;

    public List<Produit>getbyId(long id) ;

    public List<Produit> AddProduct(Produit produit) ;

    List<Produit> ModifProduct(Produit produit);

    public List<Produit> deleteProduct(Produit produit) ;

}
