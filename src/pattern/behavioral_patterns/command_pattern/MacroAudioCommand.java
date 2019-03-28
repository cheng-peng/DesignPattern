package pattern.behavioral_patterns.command_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 文 件 名: MacroAudioCommand
 * 创 建 人: CXP
 * 创建日期: 2019-03-28 11:46
 * 描    述: 具体的宏命令
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class MacroAudioCommand implements MacroCommand {

    private List<Command> mCommandList = new ArrayList<>();

    /**
     * 宏命令聚集管理方法
     */
    @Override
    public void add(Command cmd) {
        mCommandList.add(cmd);
    }

    /**
     * 宏命令聚集管理方法
     */
    @Override
    public void remove(Command cmd) {
        mCommandList.remove(cmd);
    }

    /**
     * 执行方法
     */
    @Override
    public void execute() {
        for (Command command : mCommandList) {
            command.execute();
        }
    }
}
