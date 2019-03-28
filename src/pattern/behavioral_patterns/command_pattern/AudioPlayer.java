package pattern.behavioral_patterns.command_pattern;

/**
 * 文 件 名: AudioPlayer
 * 创 建 人: CXP
 * 创建日期: 2019-03-28 11:34
 * 描    述: 接收者角色 - 录音机
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class AudioPlayer {
    public void play() {
        System.out.println("播放...");
    }

    public void rewind() {
        System.out.println("倒带...");
    }

    public void stop() {
        System.out.println("停止...");
    }
}
