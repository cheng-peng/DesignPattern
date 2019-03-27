package pattern.structural_patterns.adapter_pattern.demo4;

/**
 * 文 件 名: Mobile
 * 创 建 人: CXP
 * 创建日期: 2019-03-27 10:46
 * 描    述: 手机
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Mobile {
    /**
     * 充电
     *
     * @param power
     */
    public void inputPower(V5Power power) {
        int provideV5Power = power.provideV5Power();
        System.out.println("手机（客户端）：我需要5V电压充电，现在是-->" + provideV5Power + "V");
    }
}
