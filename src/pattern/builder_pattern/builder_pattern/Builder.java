package pattern.builder_pattern.builder_pattern;

/**
 * 文 件 名: Builder
 * 创 建 人: CXP
 * 创建日期: 2019-03-26 18:26
 * 描    述: builder抽象类
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public abstract class Builder {
    // 设置CPU核心数
    public abstract void buildCPU(int core);

    // 设置内存
    public abstract void buildRAM(int gb);

    // 设置操作系统
    public abstract void buildOs(String os);

    // 创建Computer
    public abstract Computer create();

}
