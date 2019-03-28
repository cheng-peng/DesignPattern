package pattern.behavioral_patterns.iterator_pattern;

/**
 * 文 件 名: Client
 * 创 建 人: CXP
 * 创建日期: 2019-03-28 12:25
 * 描    述: 客户端类
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Client {
    public void operation() {
        Object[] objArray = {"One", "Two", "Three", "Four", "Five", "Six"};
        //创建聚合对象
        Aggregate agg = new ConcreteAggregate(objArray);
        //循环输出聚合对象中的值
        Iterator it = agg.createIterator();
        while (!it.isDone()) {
            System.out.println(it.currentItem());
            it.next();
        }
    }

    public static void main(String[] args) {

        Client client = new Client();
        client.operation();
    }
}
