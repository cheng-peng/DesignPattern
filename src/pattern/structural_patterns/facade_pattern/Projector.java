package pattern.structural_patterns.facade_pattern;

/**
 * 文 件 名: Projector
 * 创 建 人: CXP
 * 创建日期: 2019-03-27 11:34
 * 描    述: 投影仪
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Projector {
    public void on() {
        System.out.println("打开投影仪");
    }

    public void off() {
        System.out.println("关闭投影仪");
    }

    public void open() {
        System.out.println("放下投影仪投影区");
    }

    public void close() {
        System.out.println("收起投影仪投影区");
    }
}
