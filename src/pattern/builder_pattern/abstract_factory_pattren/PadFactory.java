package pattern.builder_pattern.abstract_factory_pattren;

/**
 * 文 件 名: PadFactory
 * 创 建 人: CXP
 * 创建日期: 2019-03-26 17:03
 * 描    述: Pad工厂
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class PadFactory implements Factory {
    @Override
    public Apple createAppleProduct() {
        return new Ipad();
    }

    @Override
    public Sumsung createSumsungProduct() {
        return new Tabs();
    }
}
