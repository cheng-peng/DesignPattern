package principle.lod;

import java.util.ArrayList;
import java.util.List;

/**
 * 文 件 名: CompanyManager
 * 创 建 人: CXP
 * 创建日期: 2019-03-24 18:18
 * 描    述: 总公司管理
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class CompanyManager {
    public List<Employee> getAllEmployee(){
        List<Employee> list = new ArrayList<Employee>();
        for(int i=0; i<30; i++){
            Employee emp = new Employee();
            //为总公司人员按顺序分配一个ID
            emp.setId("总公司"+i);
            list.add(emp);
        }
        return list;
    }

    public void printAllEmployee(SubCompanyManager sub){
        sub.printEmployee();
        List<Employee> list2 = this.getAllEmployee();
        for(Employee e:list2){
            System.out.println(e.getId());
        }
    }
}
