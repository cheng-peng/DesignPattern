package pattern.structural_patterns.adapter_pattern.demo4;

/**
 * 文 件 名: V220Power
 * 创 建 人: CXP
 * 创建日期: 2019-03-27 10:47
 * 描    述: 家用220V交流电
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class V220Power {
    /**
     * 提供220V电压
     *
     * @return
     */
    public int provideV220Power() {
        System.out.println("我提供220V交流电压。");
        return 220;
    }
}
