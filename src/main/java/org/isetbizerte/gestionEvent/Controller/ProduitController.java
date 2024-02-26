package org.isetbizerte.gestionEvent.Controller;

import org.isetbizerte.gestionEvent.Entity.Produit;
import org.isetbizerte.gestionEvent.Service.ProduitService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProduitController {


    private ProduitService produitService ;

    public ProduitController(ProduitService produitService) {
        this.produitService = produitService;
    }

    @GetMapping(path = {"produits"})
    public String ProductList(Model model) {


        List<Produit> produits=produitService.getProductlist();
        model.addAtribute("produits",produits) ;
  return "produits" ;
}



}
