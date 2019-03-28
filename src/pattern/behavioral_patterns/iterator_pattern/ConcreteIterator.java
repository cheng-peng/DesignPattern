package pattern.behavioral_patterns.iterator_pattern;

/**
 * 文 件 名: ConcreteIterator
 * 创 建 人: CXP
 * 创建日期: 2019-03-28 12:24
 * 描    述: 具体迭代器角色类
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class ConcreteIterator implements Iterator {
    //持有被迭代的具体的聚合对象
    private ConcreteAggregate agg;
    //内部索引，记录当前迭代到的索引位置
    private int index = 0;
    //记录当前聚集对象的大小
    private int size = 0;

    public ConcreteIterator(ConcreteAggregate agg) {
        this.agg = agg;
        this.size = agg.size();
        index = 0;
    }

    /**
     * 迭代方法：返还当前元素
     */
    @Override
    public Object currentItem() {
        return agg.getElement(index);
    }

    /**
     * 迭代方法：移动到第一个元素
     */
    @Override
    public void first() {
        index = 0;
    }

    /**
     * 迭代方法：是否为最后一个元素
     */
    @Override
    public boolean isDone() {
        return (index >= size);
    }

    /**
     * 迭代方法：移动到下一个元素
     */
    @Override
    public void next() {
        if (index < size) {
            index++;
        }
    }
}
