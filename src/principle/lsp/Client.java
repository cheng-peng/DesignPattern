package principle.lsp;

/**
 * 文 件 名: Client
 * 创 建 人: CXP
 * 创建日期: 2019-03-24 16:52
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Client {
    public static void main(String[] args){
//        A a = new A();
//        System.out.println("100-50="+a.func1(100, 50));
//        System.out.println("100-80="+a.func1(100, 80));

        B b = new B();
        System.out.println("100-50="+b.func1(100, 50));
        System.out.println("100-80="+b.func1(100, 80));
        System.out.println("100+20+100="+b.func2(100, 20));
    }
}
