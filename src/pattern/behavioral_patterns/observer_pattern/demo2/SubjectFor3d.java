package pattern.behavioral_patterns.observer_pattern.demo2;


import java.util.Observable;

/**
 * 文 件 名: SubjectFor3d
 * 创 建 人: CXP
 * 创建日期: 2019-03-28 14:22
 * 描    述: 3D彩票服务号主题
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class SubjectFor3d extends Observable {
    private String msg;

    public String getMsg() {
        return msg;
    }

    /**
     * 主题更新消息
     *
     * @param msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
        setChanged();
        notifyObservers();
    }
}
