package pattern.behavioral_patterns.command_pattern;

/**
 * 文 件 名: Julia
 * 创 建 人: CXP
 * 创建日期: 2019-03-28 11:38
 * 描    述: 客户端角色 - 茱丽小女孩
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Julia {
    public static void main(String[] args) {

//        //创建接收者对象
//        AudioPlayer audioPlayer = new AudioPlayer();
//        //创建命令对象
//        Command playCommand = new PlayCommand(audioPlayer);
//        Command rewindCommand = new RewindCommand(audioPlayer);
//        Command stopCommand = new StopCommand(audioPlayer);
//        //创建请求者对象
//        Keypad keypad = new Keypad();
//        keypad.setPlayCommand(playCommand);
//        keypad.setRewindCommand(rewindCommand);
//        keypad.setStopCommand(stopCommand);
//        //测试
//        keypad.play();
//        keypad.rewind();
//        keypad.stop();
//        keypad.play();
//        keypad.stop();

        //创建接收者对象
        AudioPlayer audioPlayer = new AudioPlayer();
        //创建命令对象
        Command playCommand = new PlayCommand(audioPlayer);
        Command rewindCommand = new RewindCommand(audioPlayer);
        Command stopCommand = new StopCommand(audioPlayer);

        MacroCommand marco = new MacroAudioCommand();

        marco.add(playCommand);
        marco.add(rewindCommand);
        marco.add(stopCommand);
        marco.execute();
    }
}
