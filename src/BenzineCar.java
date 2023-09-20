public class BenzineCar {
    public void refuel(FuelSource source)
    {
        System.out.println("пора подзаправиться");
        source.start();
        source.poor();
        source.stop();
        System.out.println("готовы ехать");
    }
}
