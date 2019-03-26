package pattern.builder_pattern.abstract_factory_pattren;

/**
 * 文 件 名: PhoneFactory
 * 创 建 人: CXP
 * 创建日期: 2019-03-26 17:01
 * 描    述: 手机工厂
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class PhoneFactory implements Factory{
    @Override
    public Apple createAppleProduct() {
        return new Iphone();
    }

    @Override
    public Sumsung createSumsungProduct() {
        return new Note2();
    }
}
