package pattern.builder_pattern.singleton_pattern;

/**
 * 文 件 名: Singleton4
 * 创 建 人: CXP
 * 创建日期: 2019-03-26 14:47
 * 描    述: 双重检验锁，禁止指令重排序优化
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Singleton4 {
    //volatile 禁止指令重排序优化
    private volatile static Singleton4 instance;

    public Singleton4() {

    }

    public static Singleton4 getInstance() {
        if (instance == null) {
            synchronized (Singleton4.class) {
                if (instance == null) {
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }

    public void say(){
        System.out.println("单例 — 双重检验锁，禁止指令重排序优化");
    }
}
