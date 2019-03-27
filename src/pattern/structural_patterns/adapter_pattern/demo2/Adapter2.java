package pattern.structural_patterns.adapter_pattern.demo2;

/**
 * 文 件 名: Adapter1
 * 创 建 人: CXP
 * 创建日期: 2019-03-27 10:31
 * 描    述: 适配器，用来做接口转换
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Adapter2 implements Target2 {

    private Source2 mSource2;

    public Adapter2(Source2 source2) {
        this.mSource2 = source2;
    }

    @Override
    public void oldFunction() {
        // 这里调用原始类中的方法
        mSource2.oldFunction();
    }

    @Override
    public void newFunction() {
        System.out.println("newFunction:Adapter2");
    }
}
