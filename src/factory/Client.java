package factory;

/**
 * @program: design patterns
 * @description:
 * @author: zzh
 * @create: 2020-05-02 17:30
 **/
public class Client {
    public static void main(String[] args) {
        System.out.println("======================摩拜系列============");
        MobaiFactory mobaiFactory = new MobaiFactory();
        ProductCar productCar=mobaiFactory.producrCar();
        productCar.start();
        productCar.stop();

        ProductBike productBike = mobaiFactory.productBike();
        productBike.start();
        productBike.ride();

        System.out.println("=====================ofo系列============");
        OfoFactory ofoFactory = new OfoFactory();
        ProductBike productBike1 =ofoFactory.productBike();
        productBike1.ride();
        productBike1.start();

        ProductCar productCar1 = ofoFactory.producrCar();
        productCar1.start();
        productCar1.stop();
    }
}
