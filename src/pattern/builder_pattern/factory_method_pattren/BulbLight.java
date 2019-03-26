package pattern.builder_pattern.factory_method_pattren;

/**
 * 文 件 名: BulbLight
 * 创 建 人: CXP
 * 创建日期: 2019-03-26 16:03
 * 描    述: 具体的产品类 — 灯泡
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class BulbLight implements ILight {

    @Override
    public void TurnOn() {
        System.out.println("打开灯泡");
    }

    @Override
    public void TurnOff() {
        System.out.println("关闭灯泡");
    }
}
