package pattern.structural_patterns.decorator_pattern.demo2;

/**
 * 文 件 名: YellowGemDecorator
 * 创 建 人: CXP
 * 创建日期: 2019-03-27 13:39
 * 描    述: 黄宝石装饰品，每颗攻击力+10
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class YellowGemDecorator implements IEquipDecorator {
    /**
     * 每个装饰品维护一个装备
     */
    private IEquip equip;

    public YellowGemDecorator(IEquip equip) {
        this.equip = equip;
    }

    @Override
    public int caculateAttack() {
        return 10 + equip.caculateAttack();
    }

    @Override
    public String description() {
        return equip.description() + "+ 黄宝石";
    }
}
