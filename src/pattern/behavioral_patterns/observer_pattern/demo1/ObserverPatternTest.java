package pattern.behavioral_patterns.observer_pattern.demo1;

/**
 * 文 件 名: ObserverPatternTest
 * 创 建 人: CXP
 * 创建日期: 2019-03-28 13:42
 * 描    述: 测试调用
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class ObserverPatternTest {
    public static void main(String[] args) {
        //模拟一个3D的服务号
        ObjectFor3D subjectFor3d = new ObjectFor3D();
        //客户1
        Observer observer1 = new Observer1(subjectFor3d);
        //客户2
        Observer observer2 = new Observer2(subjectFor3d);

        subjectFor3d.setMsg("20140420的3D号码是：127");
        subjectFor3d.setMsg("20140421的3D号码是：333");

    }
}
