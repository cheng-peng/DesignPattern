package pattern.behavioral_patterns.command_pattern;

/**
 * 文 件 名: RewindCommand
 * 创 建 人: CXP
 * 创建日期: 2019-03-28 11:37
 * 描    述: 具体命令角色类 - 倒带
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class RewindCommand implements Command {
    private AudioPlayer myAudio;

    public RewindCommand(AudioPlayer audioPlayer){
        myAudio = audioPlayer;
    }
    @Override
    public void execute() {
        myAudio.rewind();
    }
}
