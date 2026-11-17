package abstractfactory;

public class ProduitFactory1 extends ProduitFactory
{

    public ProduitA getProduitA()
    {
        return new ProduitA1();
    }

    public ProduitB getProduitB()
    {
        return new ProduitB1();
    }
}
