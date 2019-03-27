package pattern.structural_patterns.adapter_pattern.demo3;

/**
 * 文 件 名: Test4
 * 创 建 人: CXP
 * 创建日期: 2019-03-27 10:42
 * 描    述: 测试调用
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Test4 {
    public static void main(String[] args) {
        Target3 target=new Adapter3();
        target.function1();
        target.function2();
    }
}
