package pattern.structural_patterns.adapter_pattern.demo4;

/**
 * 文 件 名: V5PowerAdapter
 * 创 建 人: CXP
 * 创建日期: 2019-03-27 10:48
 * 描    述: 充电器 — 适配器
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class V5PowerAdapter implements V5Power {
    private V220Power mV220Power;

    public V5PowerAdapter(V220Power mV220Power) {
        this.mV220Power = mV220Power;
    }

    @Override
    public int provideV5Power() {

        int power = mV220Power.provideV220Power() ;
        //power经过各种操作-->5
        System.out.println("适配器：我悄悄的适配了电压。");
        return 5 ;
    }
}
