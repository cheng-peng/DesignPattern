package pattern.behavioral_patterns.strategy_pattern.demo2;

/**
 * 文 件 名: Test2
 * 创 建 人: CXP
 * 创建日期: 2019-03-28 18:10
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Test2 {
    public static void main(String[] args) {
        Role roleA = new RoleA("A");

        roleA.setAttackBehavior(new AttackJY())//
                .setDefendBehavior(new DefendTBS())//
                .setDisplayBehavior(new DisplayYZ())//
                .setRunBehavior(new RunJCTQ());
        System.out.println(roleA.name + ":");
        roleA.run();
        roleA.attack();
        roleA.defend();
        roleA.display();
    }
}
