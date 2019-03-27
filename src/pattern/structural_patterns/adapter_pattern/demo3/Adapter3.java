package pattern.structural_patterns.adapter_pattern.demo3;

/**
 * 文 件 名: Adapter3
 * 创 建 人: CXP
 * 创建日期: 2019-03-27 10:40
 * 描    述: 适配器，继承TargetWrapper，重写自己感兴趣的方法
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Adapter3 extends TargetWrapper {
    @Override
    public void function2() {
        System.out.println("function2:Adapter");
    }
}
