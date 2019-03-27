package pattern.structural_patterns.adapter_pattern.demo3;

/**
 * 文 件 名: TargetWrapper
 * 创 建 人: CXP
 * 创建日期: 2019-03-27 10:40
 * 描    述: TargetWrapper实现了Target接口，并给出了默认实现
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class TargetWrapper implements Target3 {
    @Override
    public void function1() {
        System.out.println("function1:TargetWrapper");
    }

    @Override
    public void function2() {

    }

    @Override
    public void function3() {

    }

    @Override
    public void function4() {

    }
}
