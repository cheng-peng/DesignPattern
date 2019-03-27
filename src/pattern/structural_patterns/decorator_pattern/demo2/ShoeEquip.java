package pattern.structural_patterns.decorator_pattern.demo2;

/**
 * 文 件 名: ShoeEquip
 * 创 建 人: CXP
 * 创建日期: 2019-03-27 13:36
 * 描    述: 鞋子，攻击力 5
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class ShoeEquip implements IEquip {
    @Override
    public int caculateAttack() {
        return 5;
    }

    @Override
    public String description() {
        return "圣战靴子";
    }
}
