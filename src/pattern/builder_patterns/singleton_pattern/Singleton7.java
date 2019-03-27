package pattern.builder_patterns.singleton_pattern;

/**
 * 文 件 名: Singleton7
 * 创 建 人: CXP
 * 创建日期: 2019-03-26 14:54
 * 描    述: 枚举 Enum
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public enum Singleton7 {
    INSTANCE;

    public void say(){
        System.out.println("单例 — 枚举");
    }
}
