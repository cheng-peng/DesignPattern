package principle.lsp;

/**
 * 文 件 名: B
 * 创 建 人: CXP
 * 创建日期: 2019-03-24 16:53
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class B extends A {
    public int func1(int a, int b){
        return a+b;
    }

    public int func2(int a, int b){
        return func1(a,b)+100;
    }
}
