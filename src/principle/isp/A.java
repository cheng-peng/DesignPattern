package principle.isp;

/**
 * 文 件 名: A
 * 创 建 人: CXP
 * 创建日期: 2019-03-24 17:45
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class A {
    public void depend1(I1 i){
        i.method1();
    }
    public void depend2(I2 i){
        i.method2();
    }
    public void depend3(I2 i){
        i.method3();
    }
}
