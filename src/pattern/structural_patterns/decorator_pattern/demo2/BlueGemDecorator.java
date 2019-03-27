package pattern.structural_patterns.decorator_pattern.demo2;

/**
 * 文 件 名: BlueGemDecorator
 * 创 建 人: CXP
 * 创建日期: 2019-03-27 13:38
 * 描    述: 蓝宝石装饰品，每颗攻击力+5
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class BlueGemDecorator implements IEquipDecorator {

    /**
     * 每个装饰品维护一个装备
     */
    private IEquip equip;

    public BlueGemDecorator(IEquip equip) {
        this.equip = equip;
    }

    @Override
    public int caculateAttack() {
        return 5 + equip.caculateAttack();
    }

    @Override
    public String description() {
        return equip.description() + "+ 蓝宝石";
    }
}
