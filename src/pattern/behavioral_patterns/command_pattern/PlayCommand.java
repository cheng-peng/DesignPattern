package pattern.behavioral_patterns.command_pattern;

/**
 * 文 件 名: PlayCommand
 * 创 建 人: CXP
 * 创建日期: 2019-03-28 11:36
 * 描    述: 具体命令角色类 - 播放
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class PlayCommand implements Command {
    private AudioPlayer myAudio;

    public PlayCommand(AudioPlayer audioPlayer){
        myAudio = audioPlayer;
    }
    /**
     * 执行方法
     */
    @Override
    public void execute() {
        myAudio.play();
    }
}
