package pattern.behavioral_patterns.strategy_pattern.demo2;

/**
 * 文 件 名: DisplayYZ
 * 创 建 人: CXP
 * 创建日期: 2019-03-28 18:07
 * 描    述: 样子实现类
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class DisplayYZ implements IDisplayBehavior{

    @Override
    public void display() {
        System.out.println("样子");
    }
}
