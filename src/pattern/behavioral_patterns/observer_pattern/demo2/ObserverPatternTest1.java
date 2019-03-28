package pattern.behavioral_patterns.observer_pattern.demo2;


/**
 * 文 件 名: ObserverPatternTest1
 * 创 建 人: CXP
 * 创建日期: 2019-03-28 14:26
 * 描    述: 测试调用
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class ObserverPatternTest1 {
    public static void main(String[] args) {
        SubjectFor3d subjectFor3d = new SubjectFor3d();
        SubjectForSSQ subjectForSSQ = new SubjectForSSQ();

        Observer3 observer = new Observer3();
        observer.registerSubject(subjectFor3d);
        observer.registerSubject(subjectForSSQ);

        subjectFor3d.setMsg("hello 3d'nums : 110 ");
        subjectForSSQ.setMsg("ssq'nums : 12,13,31,5,4,3 15");

    }
}
