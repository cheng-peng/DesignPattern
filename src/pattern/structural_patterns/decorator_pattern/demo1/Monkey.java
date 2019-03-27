package pattern.structural_patterns.decorator_pattern.demo1;

/**
 * 文 件 名: Monkey
 * 创 建 人: CXP
 * 创建日期: 2019-03-27 13:10
 * 描    述: 具体构件(ConcreteComponent)角色 — 猴子
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Monkey implements TheGreatestSage {
    @Override
    public void move() {
        System.out.println("猴子");
    }
}
