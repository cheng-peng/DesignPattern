package pattern.builder_patterns.abstract_factory_pattren;

/**
 * 文 件 名: Factory
 * 创 建 人: CXP
 * 创建日期: 2019-03-26 17:00
 * 描    述: 抽象工厂
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public interface Factory {
    //创建苹果系列产品
    Apple createAppleProduct();
    //创建三星系列产品
    Sumsung createSumsungProduct();
}
