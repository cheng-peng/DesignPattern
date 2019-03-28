package pattern.behavioral_patterns.observer_pattern.demo1;

/**
 * 文 件 名: Subject
 * 创 建 人: CXP
 * 创建日期: 2019-03-28 13:38
 * 描    述: 主题接口，所有的主题必须实现此接口
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public interface Subject {
    /**
     * 注册一个观察着
     *
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 移除一个观察者
     *
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知所有的观察着
     */
    void notifyObservers();
}
