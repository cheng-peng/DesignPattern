package pattern.builder_patterns.builder_pattern;

/**
 * 文 件 名: AppleComputer
 * 创 建 人: CXP
 * 创建日期: 2019-03-26 18:25
 * 描    述: Apple电脑
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class AppleComputer extends Computer {
    @Override
    public void setCPU(int core) {
        mCpuCore = core;
    }

    @Override
    public void setRAM(int gb) {
        mRamSize = gb;
    }

    @Override
    public void setOs(String os) {
        mOs = os;
    }
}
