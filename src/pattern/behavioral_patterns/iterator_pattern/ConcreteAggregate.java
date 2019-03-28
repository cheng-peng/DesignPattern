package pattern.behavioral_patterns.iterator_pattern;

/**
 * 文 件 名: ConcreteAggregate
 * 创 建 人: CXP
 * 创建日期: 2019-03-28 12:23
 * 描    述: 具体聚集角色类
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class ConcreteAggregate extends Aggregate {
    private Object[] objArray = null;
    /**
     * 构造方法，传入聚合对象的具体内容
     */
    public ConcreteAggregate(Object[] objArray){
        this.objArray = objArray;
    }

    @Override
    public Iterator createIterator() {

        return new ConcreteIterator(this);
    }
    /**
     * 取值方法：向外界提供聚集元素
     */
    public Object getElement(int index){

        if(index
                <
                objArray.length){
            return objArray[index];
        }else{
            return null;
        }
    }
    /**
     * 取值方法：向外界提供聚集的大小
     */
    public int size(){
        return objArray.length;
    }
}
