package pattern.behavioral_patterns.strategy_pattern.demo2;

/**
 * 文 件 名: RunJCTQ
 * 创 建 人: CXP
 * 创建日期: 2019-03-28 18:08
 * 描    述: 逃跑实现类
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class RunJCTQ implements IRunBehavior {
    @Override
    public void run() {
        System.out.println("金蝉脱壳");
    }
}
