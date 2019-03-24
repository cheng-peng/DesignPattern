package principle.dip;

/**
 * 文 件 名: Book
 * 创 建 人: CXP
 * 创建日期: 2019-03-24 17:18
 * 描    述: 读书
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Book implements IReader {
    @Override
    public String getContent() {
        return "很久很久以前有一个阿拉伯的故事……";
    }
}
