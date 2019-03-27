package pattern.structural_patterns.decorator_pattern.demo1;

/**
 * 文 件 名: Bird
 * 创 建 人: CXP
 * 创建日期: 2019-03-27 13:19
 * 描    述: 具体装饰(ConcreteDecorator)角色 — 鸟
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Bird extends Change {
    public Bird(TheGreatestSage sage) {
        super(sage);
    }

    @Override
    public void move() {
        System.out.println("鸟");
    }
}
