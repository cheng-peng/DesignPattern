package principle.dip;

/**
 * 文 件 名: Mother
 * 创 建 人: CXP
 * 创建日期: 2019-03-24 17:21
 * 描    述: 妈妈
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Mother {
    public void narrate(IReader reader){
        System.out.println("妈妈开始讲故事");
        System.out.println(reader.getContent());
    }
}
