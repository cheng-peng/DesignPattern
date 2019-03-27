package pattern.builder_patterns.singleton_pattern;

/**
 * 文 件 名: Singleton2
 * 创 建 人: CXP
 * 创建日期: 2019-03-26 14:41
 * 描    述: 懒汉式，线程安全,低效率
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Singleton2 {
    private static Singleton2 instance;

    public Singleton2() {
    }

    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
    public void say(){
        System.out.println("单例 — 懒汉式，线程安全,低效率");
    }
}
