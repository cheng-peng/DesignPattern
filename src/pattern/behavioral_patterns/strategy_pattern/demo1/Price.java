package pattern.behavioral_patterns.strategy_pattern.demo1;

/**
 * 文 件 名: Price
 * 创 建 人: CXP
 * 创建日期: 2019-03-28 17:38
 * 描    述: 价格类
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Price {
    //持有一个具体的策略对象
    private MemberStrategy strategy;

    /**
     * 构造函数，传入一个具体的策略对象
     *
     * @param strategy 具体的策略对象
     */
    public Price(MemberStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 计算图书的价格
     *
     * @param booksPrice 图书的原价
     * @return 计算出打折后的价格
     */
    public double quote(double booksPrice) {
        return this.strategy.calcPrice(booksPrice);
    }
}
