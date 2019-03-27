package pattern.builder_patterns.factory_method_pattren;

/**
 * 文 件 名: ICreator
 * 创 建 人: CXP
 * 创建日期: 2019-03-26 16:06
 * 描    述: 抽象的工厂类
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public interface ICreator {
    //制造灯
    ILight CreateLight();
}
