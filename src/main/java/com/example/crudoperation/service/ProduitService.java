package com.example.crudoperation.service;

import com.example.crudoperation.model.Produit;

import java.util.List;

public interface ProduitService {
    Produit creer(Produit produit);
    List<Produit> lire();
    Produit modifier(Long id, Produit produit);
    String supprimer(Long id);
}
