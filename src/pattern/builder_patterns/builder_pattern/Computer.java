package pattern.builder_patterns.builder_pattern;

/**
 * 文 件 名: Computer
 * 创 建 人: CXP
 * 创建日期: 2019-03-26 18:22
 * 描    述: 产品抽象类
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public abstract class Computer {
    protected int mCpuCore = 1;
    protected int mRamSize = 0;
    protected String mOs = "Windows";

    protected Computer() {

    }

    // 设置CPU核心数
    public abstract void setCPU(int core);

    // 设置内存
    public abstract void setRAM(int gb);

    // 设置操作系统
    public abstract void setOs(String os);

    @Override
    public String toString() {
        return "电脑 [CPU=" + mCpuCore + ", 内存大小=" + mRamSize
                + ", 操作系统=" + mOs + "]";
    }
}
