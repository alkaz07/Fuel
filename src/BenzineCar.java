public class BenzineCar {
    public void refuel(FuelSource source)
    {
        System.out.println("���� ��������������");
        source.start();
        source.poor();
        source.stop();
        System.out.println("������ �����");
    }
}
