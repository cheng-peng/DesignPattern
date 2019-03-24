package principle.srp;

/**
 * 文 件 名: Client
 * 创 建 人: CXP
 * 创建日期: 2019-03-24 16:23
 * 描    述: 动物呼吸，陆生动物呼吸空气，水生动物呼吸水。
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Client {
    public static void main(String[] args){
        Terrestrial terrestrial = new Terrestrial();
        terrestrial.breathe("牛");
        terrestrial.breathe("羊");
        terrestrial.breathe("猪");

        Aquatic aquatic = new Aquatic();
        aquatic.breathe("鱼");
    }
}
