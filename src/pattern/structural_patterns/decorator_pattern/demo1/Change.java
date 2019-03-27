package pattern.structural_patterns.decorator_pattern.demo1;

/**
 * 文 件 名: Change
 * 创 建 人: CXP
 * 创建日期: 2019-03-27 13:12
 * 描    述: 装饰(Decorator)角色 — 七十二变
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Change implements TheGreatestSage {
    private TheGreatestSage sage;

    public Change(TheGreatestSage sage){
        this.sage = sage;
    }
    @Override
    public void move() {
        sage.move();
    }
}
