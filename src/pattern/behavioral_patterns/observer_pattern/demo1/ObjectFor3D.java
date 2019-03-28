package pattern.behavioral_patterns.observer_pattern.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * 文 件 名: ObjectFor3D
 * 创 建 人: CXP
 * 创建日期: 2019-03-28 13:39
 * 描    述: 3D服务号
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class ObjectFor3D implements Subject {

    private List<Observer> observers = new ArrayList<>();

    /**
     * 3D彩票的号码
     */
    private String msg;

    /**
     * 主题更新消息
     *
     * @param msg
     */
    public void setMsg(String msg)
    {
        this.msg = msg;

        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if (index >= 0) {
            observers.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(msg);
        }
    }
}
