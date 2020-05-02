package sington;

/**
 * @program: design patterns
 * @description: 静态内部类实现
 * @author: zzh
 * @create: 2020-05-02 16:06
 **/
public class Holder {

    private Holder(){

    }

    private static Holder getInstance(){
        return InnerHolderClass.HOLDER;
    }

    private static class InnerHolderClass{
        private static final Holder HOLDER = new Holder();
    }
}
