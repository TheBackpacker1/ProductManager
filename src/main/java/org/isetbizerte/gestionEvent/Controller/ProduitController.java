package org.isetbizerte.gestionEvent.Controller;

import org.isetbizerte.gestionEvent.Entity.Produit;
import org.isetbizerte.gestionEvent.Service.ProduitService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProduitController {


    private ProduitService produitService ;

    public ProduitController(ProduitService produitService) {
        this.produitService = produitService;
    }

    @GetMapping("produits")
    public String ProductList(Model model) {
        List<Produit> produits=produitService.getProductlist();
        model.addAttribute("produits",produits) ;
  return "produits" ;
}

@GetMapping("produits/{id}")
    public String detailProduit(Model model , @PathVariable("id") Long id){

               Produit produit= (Produit) produitService.getbyId(id);
               model.addAttribute("produit",produit) ;

        return "detail-produit" ;
}


@GetMapping("add-produit")
    public String addProduit(Model model) {
        model.addAttribute("produit",new Produit()) ;

        return "add-produit" ;
}

    @GetMapping("update-produit")
    public String updateProduit(Model model,@RequestParam("id") Long id){
        model.addAttribute("produit",produitService.getbyId(id));

        return "update-produit";
    }
    @PostMapping("save-produit")
    public String saveProduit(@ModelAttribute("produit") Produit produit){

        produit= (Produit) produitService.AddProduct(produit);

        return "redirect:produits";

    }

    @GetMapping("delete-produit/{id}")
    public String deleteEvent(@PathVariable("id") Long id){
        produitService.deleteProduct(id);
        return "redirect:/produits";
    }
}
