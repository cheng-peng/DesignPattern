package principle.isp;

/**
 * 文 件 名: C
 * 创 建 人: CXP
 * 创建日期: 2019-03-24 17:47
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class C {
    public void depend1(I1 i){
        i.method1();
    }
    public void depend2(I3 i){
        i.method4();
    }
    public void depend3(I3 i){
        i.method5();
    }
}
