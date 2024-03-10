package org.isetbizerte.gestionEvent.Service.impl;

import org.isetbizerte.gestionEvent.Entity.Produit;
import org.isetbizerte.gestionEvent.repository.ProduitRepository;
import org.isetbizerte.gestionEvent.Service.ProduitService;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.antlr.v4.runtime.tree.xpath.XPath.findAll;



@Service
public class ProduitServiceImpl implements ProduitService {


private ProduitRepository produitRepository ;
    public ProduitServiceImpl(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }

    @Override
    public List<Produit> getProductlist() {
        List<Produit> produits=produitRepository.findAll();
        return produits;
    }

    @Override
    public Produit getbyId(long id) {
        return produitRepository.findById(id).orElse(null);
    }

    @Override
    public Produit AddProduct(Produit produit) {
        return  produitRepository.save(produit);
    }
    @Override
    public Produit ModifProduct(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public void deleteProduct(Long id) {
       produitRepository.deleteById(id);
    }



}
