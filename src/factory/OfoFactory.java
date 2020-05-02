package factory;

/**
 * @program: design patterns
 * @description: ofo工厂
 * @author: zzh
 * @create: 2020-05-02 17:22
 **/
public class OfoFactory implements AbstractFactory {
    @Override
    public ProductCar producrCar() {
        return new OfoCar();
    }

    @Override
    public ProductBike productBike() {
        return new OfoBike();
    }
}
