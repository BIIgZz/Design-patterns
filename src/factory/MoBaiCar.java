package factory;

/**
 * @program: design patterns
 * @description: 摩拜汽车
 * @author: zzh
 * @create: 2020-05-02 17:14
 **/
public class MoBaiCar implements ProductCar{
    @Override
    public void start() {
        System.out.println("启动摩拜汽车");
    }

    @Override
    public void stop() {
        System.out.println("关闭摩拜汽车");
    }
}
