package pattern.behavioral_patterns.strategy_pattern.demo1;

/**
 * 文 件 名: IntermediateMemberStrategy
 * 创 建 人: CXP
 * 创建日期: 2019-03-28 17:37
 * 描    述: 中级会员折扣类
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class IntermediateMemberStrategy implements MemberStrategy {
    @Override
    public double calcPrice(double booksPrice) {

        System.out.println("对于中级会员的折扣为10%");
        return booksPrice * 0.9;
    }
}
