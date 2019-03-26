package pattern.builder_pattern.singleton_pattern;

/**
 * 文 件 名: SingletonTest
 * 创 建 人: CXP
 * 创建日期: 2019-03-26 15:00
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class SingletonTest {

    public static void main(String[] args) {
        //单例 — 懒汉式，线程不安全
        Singleton1.getInstance().say();
        //单例 — 懒汉式，线程安全,低效率
        Singleton2.getInstance().say();
        //单例 — 双重检验锁 效率高，但是可能指令重排序导致报错
        Singleton3.getInstance().say();
        //单例 — 双重检验锁，禁止指令重排序优化
        Singleton4.getInstance().say();
        //单例 — 饿汉式
        Singleton5.getInstance().say();
        //单例 — 静态内部类
        Singleton6.getInstance().say();
        //单例 — 枚举
        Singleton7.INSTANCE.say();
    }
}
