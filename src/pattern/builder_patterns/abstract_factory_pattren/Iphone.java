package pattern.builder_patterns.abstract_factory_pattren;

/**
 * 文 件 名: Iphone
 * 创 建 人: CXP
 * 创建日期: 2019-03-26 16:55
 * 描    述: 具体产品 — 苹果手机
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Iphone implements Apple{
    @Override
    public void AppleStyle() {
        System.out.println("苹果手机");
    }
}
