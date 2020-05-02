package factory;

/**
 * @program: design patterns
 * @description: ofo
 * @author: zzh
 * @create: 2020-05-02 17:12
 **/
public class OfoBike implements ProductBike {
    @Override
    public void ride() {
        System.out.println("骑ofo");
    }

    @Override
    public void start() {
        System.out.println("开始骑ofo");
    }
}
