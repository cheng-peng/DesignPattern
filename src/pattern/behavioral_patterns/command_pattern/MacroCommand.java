package pattern.behavioral_patterns.command_pattern;

/**
 * 文 件 名: MacroCommand
 * 创 建 人: CXP
 * 创建日期: 2019-03-28 11:45
 * 描    述: 宏命令的接口
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public interface MacroCommand extends Command {
    /**
     * 宏命令聚集的管理方法
     * 可以添加一个成员命令
     */
    void add(Command cmd);

    /**
     * 宏命令聚集的管理方法
     * 可以删除一个成员命令
     */
    void remove(Command cmd);
}
