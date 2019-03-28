package pattern.behavioral_patterns.iterator_pattern;

/**
 * 文 件 名: Iterator
 * 创 建 人: CXP
 * 创建日期: 2019-03-28 12:23
 * 描    述: 抽象迭代器角色类
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public interface Iterator {
    /**
     * 迭代方法：移动到第一个元素
     */
    void first();
    /**
     * 迭代方法：移动到下一个元素
     */
    void next();
    /**
     * 迭代方法：是否为最后一个元素
     */
    boolean isDone();
    /**
     * 迭代方法：返还当前元素
     */
    Object currentItem();
}
