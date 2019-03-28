package pattern.behavioral_patterns.strategy_pattern.demo2;

/**
 * 文 件 名: DefendTBS
 * 创 建 人: CXP
 * 创建日期: 2019-03-28 18:06
 * 描    述: 防御实现类
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class DefendTBS implements IDefendBehavior {
    @Override
    public void defend() {
        System.out.println("铁布衫");
    }
}
