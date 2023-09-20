public class PetrolStation implements FuelSource{

    @Override
    public void start() {
        System.out.println("ставим пистолет");
    }

    @Override
    public void poor() {
        System.out.println("буль-буль");
    }

    @Override
    public void stop() {
        System.out.println("вынимаем пистолет");
        System.out.println("надо оплатить!");
    }
}
