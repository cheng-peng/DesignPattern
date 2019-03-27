package pattern.structural_patterns.facade_pattern;

/**
 * 文 件 名: Light
 * 创 建 人: CXP
 * 创建日期: 2019-03-27 11:32
 * 描    述: 灯
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Light {
    public void down() {
        System.out.println("将灯光调暗");
    }

    public void up() {
        System.out.println("将灯光调亮");
    }
}
