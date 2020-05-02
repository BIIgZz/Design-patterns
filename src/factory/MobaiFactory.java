package factory;

/**
 * @program: design patterns
 * @description: 摩拜工厂
 * @author: zzh
 * @create: 2020-05-02 17:21
 **/
public class MobaiFactory implements AbstractFactory {
    @Override
    public ProductCar producrCar() {
        return new MoBaiCar();
    }

    @Override
    public ProductBike productBike() {
        return new MobaiBike();
    }
}
