package factory;

/**
 * @program: design patterns
 * @description: ofo汽车
 * @author: zzh
 * @create: 2020-05-02 17:16
 **/
public class OfoCar implements ProductCar{
    @Override
    public void start() {
        System.out.println("启动ofo汽车");
    }

    @Override
    public void stop() {
        System.out.println("关闭ofo汽车");
    }
}
