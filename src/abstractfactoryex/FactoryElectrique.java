package abstractfactoryex;

public class FactoryElectrique extends AbstractFactory
{
    @Override
    public Automobile ConstruireAutomobile()
    {
        return new AutomobileElectrique();
    }
    @Override
    public Scooter ConstruireScooter()
    {
        return new ScooterElectrique();
    }
}
