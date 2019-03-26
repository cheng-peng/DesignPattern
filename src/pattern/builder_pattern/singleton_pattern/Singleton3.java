package pattern.builder_pattern.singleton_pattern;

/**
 * 文 件 名: Singleton3
 * 创 建 人: CXP
 * 创建日期: 2019-03-26 14:43
 * 描    述: 双重检验锁 效率高，但是可能指令重排序导致报错
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Singleton3 {
    private static Singleton3 instance;

    public Singleton3() {

    }

    public static Singleton3 getInstance(){
        if (instance==null) {
            synchronized (Singleton3.class){
                if (instance==null) {
                    instance=new Singleton3();
                }
            }
        }
        return instance;
    }

    public void say(){
        System.out.println("单例 — 双重检验锁 效率高，但是可能指令重排序导致报错");
    }
}
