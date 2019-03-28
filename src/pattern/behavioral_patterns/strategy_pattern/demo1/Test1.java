package pattern.behavioral_patterns.strategy_pattern.demo1;

/**
 * 文 件 名: Test1
 * 创 建 人: CXP
 * 创建日期: 2019-03-28 17:38
 * 描    述: 测试调用
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Test1 {
    public static void main(String[] args) {
        //选择并创建需要使用的策略对象
        MemberStrategy strategy = new AdvancedMemberStrategy();
        //创建环境
        Price price = new Price(strategy);
        //计算价格
        double quote = price.quote(300);
        System.out.println("图书的最终价格为：" + quote);
    }
}
