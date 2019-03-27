package pattern.structural_patterns.decorator_pattern.demo2;

/**
 * 文 件 名: IEquip
 * 创 建 人: CXP
 * 创建日期: 2019-03-27 13:33
 * 描    述: 装备的接口
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public interface IEquip {
    //计算攻击力
    int caculateAttack();

    //装备的描述
    String description();
}
