package pattern.behavioral_patterns.strategy_pattern.demo1;

/**
 * 文 件 名: AdvancedMemberStrategy
 * 创 建 人: CXP
 * 创建日期: 2019-03-28 17:38
 * 描    述: 高级会员折扣类
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class AdvancedMemberStrategy implements MemberStrategy {
    @Override
    public double calcPrice(double booksPrice) {

        System.out.println("对于高级会员的折扣为20%");
        return booksPrice * 0.8;
    }
}
