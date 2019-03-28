package pattern.behavioral_patterns.observer_pattern.demo1;

/**
 * 文 件 名: Observer2
 * 创 建 人: CXP
 * 创建日期: 2019-03-28 13:41
 * 描    述: 使用者2
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Observer2 implements Observer {
    private Subject subject;

    public Observer2(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        System.out.println("observer2 得到 3D 号码 -->" + msg + "我要告诉舍友们。");
    }
}
