package factory;

/**
 * @program: design patterns
 * @description: 摩拜单车
 * @author: zzh
 * @create: 2020-05-02 17:11
 **/
public class MobaiBike implements ProductBike {
    @Override
    public void ride() {
        System.out.println("骑车");
    }

    @Override
    public void start() {
        System.out.println("启动单车");
    }
}
