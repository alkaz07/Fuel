public class PetrolStation implements FuelSource{

    @Override
    public void start() {
        System.out.println("������ ��������");
    }

    @Override
    public void poor() {
        System.out.println("����-����");
    }

    @Override
    public void stop() {
        System.out.println("�������� ��������");
        System.out.println("���� ��������!");
    }
}
