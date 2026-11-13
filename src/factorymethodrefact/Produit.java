package factorymethodrefact;

public abstract class Produit
{
    public abstract void methodeproduit();
    
}

class ProduitA extends Produit 
{
    public ProduitA()
    {

    }
    public void methodeproduit()
    {
        System.out.println("je suis un produit de type A");
        System.out.println("produitA.methodeproduit()");
    }
}

class ProduitB extends Produit 
{
    public ProduitB()
    {

    }
    public void methodeproduit()
    {
        System.out.println("je suis un produit de type B");
        System.out.println("produitB.methodeproduit()");
    }
}

class ProduitC extends Produit 
{
    public ProduitC()
    {

    }
    public void methodeproduit()
    {
        System.out.println("je suis un produit de type C");
        System.out.println("produitC.methodeproduit()");
    }
}

class ProduitD extends Produit 
{
    public ProduitD()
    {

    }
    public void methodeproduit()
    {
        System.out.println("je suis un produit de type D");
        System.out.println("produitD.methodeproduit()");
    }
}