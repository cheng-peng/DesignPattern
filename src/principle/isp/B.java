package principle.isp;

/**
 * 文 件 名: B
 * 创 建 人: CXP
 * 创建日期: 2019-03-24 17:46
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class B implements I1, I2{

    @Override
    public void method1() {
        System.out.println("类B实现接口I1的方法1");
    }

    @Override
    public void method2() {
        System.out.println("类B实现接口I2的方法2");
    }

    @Override
    public void method3() {
        System.out.println("类B实现接口I2的方法3");
    }
}
