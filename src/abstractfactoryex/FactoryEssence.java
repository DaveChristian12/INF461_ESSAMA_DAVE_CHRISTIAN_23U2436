package abstractfactoryex;

public class FactoryEssence extends AbstractFactory
{
    @Override
    public Automobile ConstruireAutomobile()
    {
        return new AutomobileEssence();
    }
    @Override
    public Scooter ConstruireScooter()
    {
        return new ScooterEssence();
    }
}
