package pattern.builder_pattern.builder_pattern;

/**
 * 文 件 名: Director
 * 创 建 人: CXP
 * 创建日期: 2019-03-26 18:30
 * 描    述: 监督者
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Director {
    Builder mBuilder = null;

    /**
     *
     * @param builder
     */
    public Director(Builder builder) {
        mBuilder = builder;
    }

    /**
     * 构建对象
     *
     * @param cpu
     * @param ram
     * @param os
     */
    public void construct(int cpu, int ram, String os) {
        mBuilder.buildCPU(cpu);
        mBuilder.buildRAM(ram);
        mBuilder.buildOs(os);
    }
}
