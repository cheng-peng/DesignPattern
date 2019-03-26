package pattern.builder_pattern.singleton_pattern;

/**
 * 文 件 名: Singleton5
 * 创 建 人: CXP
 * 创建日期: 2019-03-26 14:50
 * 描    述: 饿汉式 static final field
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Singleton5 {
    //类加载时就初始化
    private static Singleton5 instance = new Singleton5();

    public Singleton5() {
    }

    public static Singleton5 getInstance() {
        return instance;
    }

    public void say(){
        System.out.println("单例 — 饿汉式");
    }
}
