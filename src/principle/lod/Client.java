package principle.lod;

/**
 * 文 件 名: Client
 * 创 建 人: CXP
 * 创建日期: 2019-03-24 18:18
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Client {
    public static void main(String[] args){
        CompanyManager e = new CompanyManager();
        e.printAllEmployee(new SubCompanyManager());
    }
}
