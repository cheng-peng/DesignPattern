package pattern.structural_patterns.adapter_pattern.demo1;

/**
 * 文 件 名: Adapter1
 * 创 建 人: CXP
 * 创建日期: 2019-03-27 10:31
 * 描    述: 适配器，用来做接口转换
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Adapter1 extends Source1 implements Target1 {

    public Adapter1() {
        super();
    }

    @Override
    public void newFunction() {
        System.out.println("newFunction:Adapter1");
    }
}
