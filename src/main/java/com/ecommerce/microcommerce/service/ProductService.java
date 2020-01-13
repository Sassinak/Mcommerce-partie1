package com.ecommerce.microcommerce.service;

import com.ecommerce.microcommerce.model.Product;

/**
 * Classe de service implementee
 * pour comprendre les normes et les pratiques
 * de la compagnie (extra)
 */
public class ProductService{ //extends Product{
    
   public Product product;

   /*  public ProductService(Product p){
        this.product = p;
    }
    public int margeProduit(){
        return this.product.getPrix() - this.product.getPrixAchat();
    }*/
    public int margeProduit(Product p){
        return p.getPrix() - p.getPrixAchat();
    }
   /* public String afficherMargeProduit(){
        int marge = this.margeProduit();
        return this.toString() + ": " + marge ;
    }*/
    
}
