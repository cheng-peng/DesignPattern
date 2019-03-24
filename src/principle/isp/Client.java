package principle.isp;

/**
 * 文 件 名: Client
 * 创 建 人: CXP
 * 创建日期: 2019-03-24 17:48
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Client {
    public static void main(String[] args){
        A a = new A();
        a.depend1(new B());
        a.depend2(new B());
        a.depend3(new B());

        C c = new C();
        c.depend1(new D());
        c.depend2(new D());
        c.depend3(new D());
    }
}
