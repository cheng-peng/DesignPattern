package pattern.behavioral_patterns.command_pattern;

/**
 * 文 件 名: StopCommand
 * 创 建 人: CXP
 * 创建日期: 2019-03-28 11:37
 * 描    述: 具体命令角色类 - 停止
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class StopCommand implements Command {
    private AudioPlayer myAudio;

    public StopCommand(AudioPlayer audioPlayer) {
        myAudio = audioPlayer;
    }

    @Override
    public void execute() {
        myAudio.stop();
    }

}
