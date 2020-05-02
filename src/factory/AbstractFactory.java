package factory;

/**
 * @program: design patterns
 * @description: 抽象工厂模式
 * @author: zzh
 * @create: 2020-05-02 16:27
 **/

public interface AbstractFactory {
    /*
     * 抽象工厂是创建工厂的工厂，生产产品
     */
    //生产汽车
    ProductCar producrCar();

    //生产单车
    ProductBike productBike();

}
