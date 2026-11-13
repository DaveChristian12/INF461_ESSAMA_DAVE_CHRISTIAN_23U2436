package factorymethodrefact;

import factorymethodrefact.FabriqueProduit;
import factorymethodrefact.Produit;


public class Client
{
    public static void main(String[] args)
    {
        System.out.println("Bonjour le monde");

        FabriqueProduit fabrique = new FabriqueProduit();
        Produit produit=null;

        Produit produitA = FabriqueProduit.creerProduit(FabriqueProduit.typeA);
        produitA.methodeproduit();
        
        Produit produitB = FabriqueProduit.creerProduit(FabriqueProduit.typeB);
        produitB.methodeproduit();
        
        Produit produitC = FabriqueProduit.creerProduit(FabriqueProduit.typeC);
        produitC.methodeproduit();
        
        Produit produitD = FabriqueProduit.creerProduit(FabriqueProduit.typeD);
        produitD.methodeproduit();

    }
}