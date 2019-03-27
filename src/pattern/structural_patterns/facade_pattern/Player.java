package pattern.structural_patterns.facade_pattern;

/**
 * 文 件 名: Player
 * 创 建 人: CXP
 * 创建日期: 2019-03-27 11:31
 * 描    述: 播放器
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Player {
    public void on() {
        System.out.println("打开播放器");
    }

    public void off() {
        System.out.println("关闭播放器");
    }

    public void make3D() {
        System.out.println("将播放器音调设为环绕立体声");
    }
}
