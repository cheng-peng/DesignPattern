package principle.dip;

/**
 * 文 件 名: Newspaper
 * 创 建 人: CXP
 * 创建日期: 2019-03-24 17:20
 * 描    述: 新闻
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Newspaper implements IReader{
    @Override
    public String getContent() {
        return "林书豪17+9助尼克斯击败老鹰……";
    }
}
