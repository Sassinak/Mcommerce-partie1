package com.ecommerce.microcommerce.service;

import com.ecommerce.microcommerce.dao.ProductDao;
import com.ecommerce.microcommerce.model.Product;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Classe de service implementee
 * pour comprendre les normes et les pratiques
 * de la compagnie (extra)
 */
@Service
public class ProductService{ //extends Product{
    
   public Product product;

   private final ProductDao productDao;

   public ProductService(ProductDao pd){
        this.productDao = pd;
    }

   public Map<Product, Integer> afficherAdminProduits(){

        List<Product> Lproduit = this.productDao.findAll();
        Map<Product, Integer> liste = new HashMap<>();

        for (Product p : Lproduit) {

            Integer marge =  p.getPrix() - p.getPrixAchat();
            liste.put(p, marge);
        }
        return liste;
    }
    
}
