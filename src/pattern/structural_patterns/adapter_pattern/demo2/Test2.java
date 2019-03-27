package pattern.structural_patterns.adapter_pattern.demo2;

/**
 * 文 件 名: Test2
 * 创 建 人: CXP
 * 创建日期: 2019-03-27 10:32
 * 描    述: 测试调用
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Test2 {
    public static void main(String[] args) {
        Source2 source2=new Source2();
        Target2 target = new Adapter2(source2);
        target.oldFunction();
        target.newFunction();
    }
}
