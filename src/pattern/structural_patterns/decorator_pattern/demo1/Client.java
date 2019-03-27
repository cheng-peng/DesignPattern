package pattern.structural_patterns.decorator_pattern.demo1;

/**
 * 文 件 名: Client
 * 创 建 人: CXP
 * 创建日期: 2019-03-27 13:21
 * 描    述: 测试调用
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Client {
    public static void main(String[] args) {
        TheGreatestSage sage = new Monkey();
        // 第一种写法  单层装饰
        TheGreatestSage bird = new Bird(sage);
        TheGreatestSage fish = new Fish(bird);
        // 第二种写法 双层装饰
        //TheGreatestSage fish = new Fish(new Bird(sage));
        fish.move();
    }
}
