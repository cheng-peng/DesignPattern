package principle.isp;

/**
 * 文 件 名: D
 * 创 建 人: CXP
 * 创建日期: 2019-03-24 17:47
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class D implements I1, I3{
    @Override
    public void method1() {
        System.out.println("类D实现接口I1的方法1");
    }

    @Override
    public void method4() {
        System.out.println("类D实现接口I3的方法4");
    }

    @Override
    public void method5() {
        System.out.println("类D实现接口I3的方法5");
    }
}
