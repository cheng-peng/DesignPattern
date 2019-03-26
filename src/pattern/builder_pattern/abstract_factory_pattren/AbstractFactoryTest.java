package pattern.builder_pattern.abstract_factory_pattren;

/**
 * 文 件 名: AbstractFactoryTest
 * 创 建 人: CXP
 * 创建日期: 2019-03-26 17:04
 * 描    述: 测试调用
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        //采购商要一台iPad和一台Tab
        Factory factory = new PadFactory();
        Apple apple = factory.createAppleProduct();
        apple.AppleStyle();
        Sumsung sumsung = factory.createSumsungProduct();
        sumsung.BangziStyle();

        //采购商又要一台iPhone和一台Note2
        factory = new PhoneFactory();
        apple = factory.createAppleProduct();
        apple.AppleStyle();
        sumsung = factory.createSumsungProduct();
        sumsung.BangziStyle();
    }
}
