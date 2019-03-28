package pattern.behavioral_patterns.observer_pattern.demo1;

/**
 * 文 件 名: Observer
 * 创 建 人: CXP
 * 创建日期: 2019-03-28 13:38
 * 描    述: 所有的观察者需要实现此接口
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public interface Observer {
    void update(String msg);
}
