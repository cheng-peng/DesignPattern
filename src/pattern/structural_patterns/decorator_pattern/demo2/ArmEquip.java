package pattern.structural_patterns.decorator_pattern.demo2;

/**
 * 文 件 名: ArmEquip
 * 创 建 人: CXP
 * 创建日期: 2019-03-27 13:34
 * 描    述: 武器，攻击力20
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class ArmEquip implements IEquip {
    @Override
    public int caculateAttack() {
        return 20;
    }

    @Override
    public String description() {
        return "屠龙刀";
    }
}
