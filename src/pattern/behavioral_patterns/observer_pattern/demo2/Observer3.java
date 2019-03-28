package pattern.behavioral_patterns.observer_pattern.demo2;

import java.util.Observable;
import java.util.Observer;

/**
 * 文 件 名: Observer3
 * 创 建 人: CXP
 * 创建日期: 2019-03-28 14:24
 * 描    述: 使用者3
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Observer3 implements Observer {

    public void registerSubject(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof SubjectFor3d) {
            SubjectFor3d subjectFor3d = (SubjectFor3d) o;
            System.out.println("subjectFor3d's msg -- >" + subjectFor3d.getMsg());
        }

        if (o instanceof SubjectForSSQ) {
            SubjectForSSQ subjectForSSQ = (SubjectForSSQ) o;
            System.out.println("subjectForSSQ's msg -- >" + subjectForSSQ.getMsg());
        }
    }
}
