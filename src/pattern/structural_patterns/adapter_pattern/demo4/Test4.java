package pattern.structural_patterns.adapter_pattern.demo4;

/**
 * 文 件 名: Test4
 * 创 建 人: CXP
 * 创建日期: 2019-03-27 10:50
 * 描    述: 测试调用
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Test4 {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        V220Power mV220Power = new V220Power();
        V5Power mV5Power = new V5PowerAdapter(mV220Power);
        mobile.inputPower(mV5Power);
    }
}
