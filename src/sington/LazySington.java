package sington;

/**
 * @program: design patterns
 * @description: 懒汉式单例
 * @author: zzh
 * @create: 2020-05-02 15:21
 **/


public class LazySington {

    private LazySington(){
        System.out.println(Thread.currentThread().getName()+"ok");
    }
    private volatile static LazySington lazySington;
    //双重检测锁模式    Dcl
    public static LazySington getInstance(){
        //加锁
        if (lazySington==null){
            synchronized (LazySington.class){
                if (lazySington==null){
                    lazySington = new LazySington();   //不是原子性操作
                    /*
                     *1.分配内存空间
                     * 2.执行构造方法，初始化对象
                     * 3.把这个对象纸箱空间
                     */
                }
            }
        }


        return lazySington;
    }
    //多线程并发会出现问题，需要加锁
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                LazySington.getInstance();
            }).start();
        }
    }
}
