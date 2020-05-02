package sington;

/**
 * @program: design patterns
 * @description: 饿汉式单例
 * @author: zzh
 * @create: 2020-05-02 15:29
 **/
public class HungarySingle {

    //可能浪费空间,一上来就加载
    private byte[] data1 = new byte[1024];

    //首先私有构造器
    private HungarySingle(){

    }
    private final static HungarySingle HUNGARY_SINGLE = new HungarySingle();

    public static HungarySingle getInstance(){
        return HUNGARY_SINGLE;
    }
}
