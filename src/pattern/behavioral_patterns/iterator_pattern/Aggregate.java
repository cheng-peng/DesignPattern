package pattern.behavioral_patterns.iterator_pattern;

/**
 * 文 件 名: Aggregate
 * 创 建 人: CXP
 * 创建日期: 2019-03-28 12:22
 * 描    述: 抽象聚集角色类
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public abstract class Aggregate {
    /**
     * 工厂方法，创建相应迭代子对象的接口
     */
    public abstract Iterator createIterator();
}
