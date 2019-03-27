package pattern.structural_patterns.decorator_pattern.demo2;

/**
 * 文 件 名: WristEquip
 * 创 建 人: CXP
 * 创建日期: 2019-03-27 13:35
 * 描    述: 护腕，攻击力 5
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class WristEquip implements IEquip {
    @Override
    public int caculateAttack() {
        return 5;
    }

    @Override
    public String description() {
        return "圣战护腕";
    }
}
