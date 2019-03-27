package pattern.builder_patterns.factory_method_pattren;

/**
 * 文 件 名: TubeCreator
 * 创 建 人: CXP
 * 创建日期: 2019-03-26 16:08
 * 描    述: 具体的工厂类 — 制造灯管
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class TubeCreator implements ICreator {
    @Override
    public ILight CreateLight() {
        return new TubeLight();
    }
}
