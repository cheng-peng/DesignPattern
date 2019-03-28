package pattern.behavioral_patterns.strategy_pattern.demo1;

/**
 * 文 件 名: MemberStrategy
 * 创 建 人: CXP
 * 创建日期: 2019-03-28 17:36
 * 描    述: 抽象折扣类
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public interface MemberStrategy {
    /**
     * 计算图书的价格
     *
     * @param booksPrice 图书的原价
     * @return 计算出打折后的价格
     */
    double calcPrice(double booksPrice);
}
