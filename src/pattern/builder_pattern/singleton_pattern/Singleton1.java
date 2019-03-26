package pattern.builder_pattern.singleton_pattern;

/**
 * 文 件 名: Singleton1
 * 创 建 人: CXP
 * 创建日期: 2019-03-26 11:24
 * 描    述: 懒汉式，线程不安全
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Singleton1 {
    private static Singleton1 instance;

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }

    public void say(){
        System.out.println("单例 — 懒汉式，线程不安全");
    }
}
