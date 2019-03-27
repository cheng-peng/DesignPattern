package pattern.structural_patterns.facade_pattern;

/**
 * 文 件 名: PopcornPopper
 * 创 建 人: CXP
 * 创建日期: 2019-03-27 11:36
 * 描    述: 爆米花
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class PopcornPopper {

    public void on() {
        System.out.println("打开爆米花机");
    }

    public void off() {
        System.out.println("关闭爆米花机");
    }

    public void makePopcorn() {
        System.out.println("制作爆米花");
    }

    public void stopMakePopcorn() {
        System.out.println("停止制作爆米花");
    }

}
