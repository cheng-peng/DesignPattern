package pattern.structural_patterns.adapter_pattern.demo1;

/**
 * 文 件 名: Test1
 * 创 建 人: CXP
 * 创建日期: 2019-03-27 10:32
 * 描    述: 测试调用
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Test1 {
    public static void main(String[] args) {
        Target1 target = new Adapter1();
        target.oldFunction();
        target.newFunction();
    }
}
