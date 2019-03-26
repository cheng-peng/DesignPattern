package pattern.builder_pattern.factory_method_pattren;

/**
 * 文 件 名: TubeLight
 * 创 建 人: CXP
 * 创建日期: 2019-03-26 16:05
 * 描    述: 具体的产品类 — 灯管
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class TubeLight implements ILight {
    @Override
    public void TurnOn() {
        System.out.println("打开灯管");
    }

    @Override
    public void TurnOff() {
        System.out.println("关闭灯管");
    }
}
