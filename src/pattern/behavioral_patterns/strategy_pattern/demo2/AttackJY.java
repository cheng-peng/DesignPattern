package pattern.behavioral_patterns.strategy_pattern.demo2;

/**
 * 文 件 名: AttackJY
 * 创 建 人: CXP
 * 创建日期: 2019-03-28 18:05
 * 描    述: 攻击实现类
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class AttackJY implements IAttackBehavior {
    @Override
    public void attack() {
        System.out.println("九阳神功！");
    }
}
