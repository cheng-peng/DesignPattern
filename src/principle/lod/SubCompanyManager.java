package principle.lod;

import java.util.ArrayList;
import java.util.List;

/**
 * 文 件 名: SubCompanyManager
 * 创 建 人: CXP
 * 创建日期: 2019-03-24 18:17
 * 描    述: 分公司管理
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class SubCompanyManager {
    public List<SubEmployee> getAllEmployee() {
        List<SubEmployee> list = new ArrayList<SubEmployee>();
        for (int i = 0; i < 100; i++) {
            SubEmployee emp = new SubEmployee();
            //为分公司人员按顺序分配一个ID
            emp.setId("分公司" + i);
            list.add(emp);
        }
        return list;
    }

    public void printEmployee() {
        List<SubEmployee> list = this.getAllEmployee();
        for (SubEmployee e : list) {
            System.out.println(e.getId());
        }
    }
}
