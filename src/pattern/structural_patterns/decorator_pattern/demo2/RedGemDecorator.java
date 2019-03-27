package pattern.structural_patterns.decorator_pattern.demo2;

/**
 * 文 件 名: RedGemDecorator
 * 创 建 人: CXP
 * 创建日期: 2019-03-27 13:40
 * 描    述: 红宝石装饰品，每颗攻击力+15
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class RedGemDecorator implements IEquipDecorator {
    /**
     * 每个装饰品维护一个装备
     */
    private IEquip equip;

    public RedGemDecorator(IEquip equip) {
        this.equip = equip;
    }

    @Override
    public int caculateAttack() {
        return 15 + equip.caculateAttack();
    }

    @Override
    public String description() {
        return equip.description() + "+ 红宝石";
    }
}
