package pattern.builder_pattern.singleton_pattern;

/**
 * 文 件 名: Singleton6
 * 创 建 人: CXP
 * 创建日期: 2019-03-26 14:52
 * 描    述: 静态内部类 static nested class
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Singleton6 {
    private static class SingletonHolder {
        private static final Singleton6 INSTANCE = new Singleton6();
    }

    public Singleton6() {
    }

    public static final Singleton6 getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void say(){
        System.out.println("单例 — 静态内部类");
    }
}
