package pattern.builder_pattern.builder_pattern;

/**
 * 文 件 名: ApplePCBuilder
 * 创 建 人: CXP
 * 创建日期: 2019-03-26 18:27
 * 描    述: 苹果电脑构造
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class ApplePCBuilder extends Builder {

    private Computer mApplePc = new AppleComputer();

    @Override
    public void buildCPU(int core) {
        mApplePc.setCPU(core);
    }

    @Override
    public void buildRAM(int gb) {
        mApplePc.setRAM(gb);
    }

    @Override
    public void buildOs(String os) {
        mApplePc.setOs(os);
    }

    @Override
    public Computer create() {
        return mApplePc;
    }
}
