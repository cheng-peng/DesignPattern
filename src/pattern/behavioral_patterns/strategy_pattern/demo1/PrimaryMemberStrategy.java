package pattern.behavioral_patterns.strategy_pattern.demo1;

/**
 * 文 件 名: PrimaryMemberStrategy
 * 创 建 人: CXP
 * 创建日期: 2019-03-28 17:36
 * 描    述: 初级会员折扣类
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class PrimaryMemberStrategy implements MemberStrategy {
    @Override
    public double calcPrice(double booksPrice) {

        System.out.println("对于初级会员的没有折扣");
        return booksPrice;
    }
}
